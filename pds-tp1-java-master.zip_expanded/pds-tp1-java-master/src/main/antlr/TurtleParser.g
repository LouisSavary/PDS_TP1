parser grammar TurtleParser;

options {
  language = Java;
  tokenVocab = TurtleLexer;
}

@header {
  package TP1;
}

document returns [ASD.Document out] :
 	s=statements EOF { $out = new ASD.Document($s.out.substring(4)); };
 	// j'enleve les quatre premiers caractères de la chaine, 
 	// parce que "null" apparaissait au debut de la chaine 
 	// sans aucune raison. c'est la seule solution que j'ai trouvé

// reconnait le sujet de triplet, et le propage dans l'AST, puis recupere les triplets
triplet returns [String triplets] : 
	ENTITY  v1=verbe[$ENTITY.text] {$triplets = $v1.triplets_verbe;} 
	(PTVIRG v2=verbe[$ENTITY.text] {$triplets += "\n" + $v2.triplets_verbe;})* 
	POINT
	;

// reconnait les verbes, transmet le sujet et le verbe aux objets, et recupere les triplets
verbe [String sujet] returns [String triplets_verbe] : 
	ENTITY objet[$sujet, $ENTITY.text] {$triplets_verbe = $objet.triplets_objet;} 
	(VIRG objet[$sujet, $ENTITY.text] {$triplets_verbe += "\n"+ $objet.triplets_objet;})* 
	;
	
//reconnait les objets et construit les triplets
objet [String sujet, String verbe_name] returns [String triplets_objet] : 
	(ENTITY {$triplets_objet = $sujet + " " + $verbe_name + " " + $ENTITY.text + " .";} |
	 STRING {$triplets_objet = $sujet + " " + $verbe_name + " " + $STRING.text + " .";}) 
	;

statements returns [String out] : (t=triplet {$out += $t.triplets + "\n";})*;
