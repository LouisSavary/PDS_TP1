// Generated from TurtleParser.g by ANTLR 4.7.1

  package TP1;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TurtleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WS=1, ENTITY=2, STRING=3, PTVIRG=4, POINT=5, VIRG=6;
	public static final int
		RULE_document = 0, RULE_triplet = 1, RULE_verbe = 2, RULE_objet = 3, RULE_statements = 4;
	public static final String[] ruleNames = {
		"document", "triplet", "verbe", "objet", "statements"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, "';'", "'.'", "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "WS", "ENTITY", "STRING", "PTVIRG", "POINT", "VIRG"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TurtleParser.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TurtleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class DocumentContext extends ParserRuleContext {
		public ASD.Document out;
		public StatementsContext s;
		public TerminalNode EOF() { return getToken(TurtleParser.EOF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public DocumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_document; }
	}

	public final DocumentContext document() throws RecognitionException {
		DocumentContext _localctx = new DocumentContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_document);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			((DocumentContext)_localctx).s = statements();
			setState(11);
			match(EOF);
			 ((DocumentContext)_localctx).out =  new ASD.Document(((DocumentContext)_localctx).s.out.substring(4)); 
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TripletContext extends ParserRuleContext {
		public String triplets;
		public Token ENTITY;
		public VerbeContext v1;
		public VerbeContext v2;
		public TerminalNode ENTITY() { return getToken(TurtleParser.ENTITY, 0); }
		public TerminalNode POINT() { return getToken(TurtleParser.POINT, 0); }
		public List<VerbeContext> verbe() {
			return getRuleContexts(VerbeContext.class);
		}
		public VerbeContext verbe(int i) {
			return getRuleContext(VerbeContext.class,i);
		}
		public List<TerminalNode> PTVIRG() { return getTokens(TurtleParser.PTVIRG); }
		public TerminalNode PTVIRG(int i) {
			return getToken(TurtleParser.PTVIRG, i);
		}
		public TripletContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triplet; }
	}

	public final TripletContext triplet() throws RecognitionException {
		TripletContext _localctx = new TripletContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_triplet);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			((TripletContext)_localctx).ENTITY = match(ENTITY);
			setState(15);
			((TripletContext)_localctx).v1 = verbe((((TripletContext)_localctx).ENTITY!=null?((TripletContext)_localctx).ENTITY.getText():null));
			((TripletContext)_localctx).triplets =  ((TripletContext)_localctx).v1.triplets_verbe;
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PTVIRG) {
				{
				{
				setState(17);
				match(PTVIRG);
				setState(18);
				((TripletContext)_localctx).v2 = verbe((((TripletContext)_localctx).ENTITY!=null?((TripletContext)_localctx).ENTITY.getText():null));
				_localctx.triplets += "\n" + ((TripletContext)_localctx).v2.triplets_verbe;
				}
				}
				setState(25);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(26);
			match(POINT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VerbeContext extends ParserRuleContext {
		public String sujet;
		public String triplets_verbe;
		public Token ENTITY;
		public ObjetContext objet;
		public TerminalNode ENTITY() { return getToken(TurtleParser.ENTITY, 0); }
		public List<ObjetContext> objet() {
			return getRuleContexts(ObjetContext.class);
		}
		public ObjetContext objet(int i) {
			return getRuleContext(ObjetContext.class,i);
		}
		public List<TerminalNode> VIRG() { return getTokens(TurtleParser.VIRG); }
		public TerminalNode VIRG(int i) {
			return getToken(TurtleParser.VIRG, i);
		}
		public VerbeContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public VerbeContext(ParserRuleContext parent, int invokingState, String sujet) {
			super(parent, invokingState);
			this.sujet = sujet;
		}
		@Override public int getRuleIndex() { return RULE_verbe; }
	}

	public final VerbeContext verbe(String sujet) throws RecognitionException {
		VerbeContext _localctx = new VerbeContext(_ctx, getState(), sujet);
		enterRule(_localctx, 4, RULE_verbe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			((VerbeContext)_localctx).ENTITY = match(ENTITY);
			setState(29);
			((VerbeContext)_localctx).objet = objet(_localctx.sujet, (((VerbeContext)_localctx).ENTITY!=null?((VerbeContext)_localctx).ENTITY.getText():null));
			((VerbeContext)_localctx).triplets_verbe =  ((VerbeContext)_localctx).objet.triplets_objet;
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VIRG) {
				{
				{
				setState(31);
				match(VIRG);
				setState(32);
				((VerbeContext)_localctx).objet = objet(_localctx.sujet, (((VerbeContext)_localctx).ENTITY!=null?((VerbeContext)_localctx).ENTITY.getText():null));
				_localctx.triplets_verbe += "\n"+ ((VerbeContext)_localctx).objet.triplets_objet;
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjetContext extends ParserRuleContext {
		public String sujet;
		public String verbe_name;
		public String triplets_objet;
		public Token ENTITY;
		public Token STRING;
		public TerminalNode ENTITY() { return getToken(TurtleParser.ENTITY, 0); }
		public TerminalNode STRING() { return getToken(TurtleParser.STRING, 0); }
		public ObjetContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ObjetContext(ParserRuleContext parent, int invokingState, String sujet, String verbe_name) {
			super(parent, invokingState);
			this.sujet = sujet;
			this.verbe_name = verbe_name;
		}
		@Override public int getRuleIndex() { return RULE_objet; }
	}

	public final ObjetContext objet(String sujet,String verbe_name) throws RecognitionException {
		ObjetContext _localctx = new ObjetContext(_ctx, getState(), sujet, verbe_name);
		enterRule(_localctx, 6, RULE_objet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTITY:
				{
				setState(40);
				((ObjetContext)_localctx).ENTITY = match(ENTITY);
				((ObjetContext)_localctx).triplets_objet =  _localctx.sujet + " " + _localctx.verbe_name + " " + (((ObjetContext)_localctx).ENTITY!=null?((ObjetContext)_localctx).ENTITY.getText():null) + " .";
				}
				break;
			case STRING:
				{
				setState(42);
				((ObjetContext)_localctx).STRING = match(STRING);
				((ObjetContext)_localctx).triplets_objet =  _localctx.sujet + " " + _localctx.verbe_name + " " + (((ObjetContext)_localctx).STRING!=null?((ObjetContext)_localctx).STRING.getText():null) + " .";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public String out;
		public TripletContext t;
		public List<TripletContext> triplet() {
			return getRuleContexts(TripletContext.class);
		}
		public TripletContext triplet(int i) {
			return getRuleContext(TripletContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ENTITY) {
				{
				{
				setState(46);
				((StatementsContext)_localctx).t = triplet();
				_localctx.out += ((StatementsContext)_localctx).t.triplets + "\n";
				}
				}
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\b9\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\7\3\30\n\3\f\3\16\3\33\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4&"+
		"\n\4\f\4\16\4)\13\4\3\5\3\5\3\5\3\5\5\5/\n\5\3\6\3\6\3\6\7\6\64\n\6\f"+
		"\6\16\6\67\13\6\3\6\2\2\7\2\4\6\b\n\2\2\2\67\2\f\3\2\2\2\4\20\3\2\2\2"+
		"\6\36\3\2\2\2\b.\3\2\2\2\n\65\3\2\2\2\f\r\5\n\6\2\r\16\7\2\2\3\16\17\b"+
		"\2\1\2\17\3\3\2\2\2\20\21\7\4\2\2\21\22\5\6\4\2\22\31\b\3\1\2\23\24\7"+
		"\6\2\2\24\25\5\6\4\2\25\26\b\3\1\2\26\30\3\2\2\2\27\23\3\2\2\2\30\33\3"+
		"\2\2\2\31\27\3\2\2\2\31\32\3\2\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34\35\7"+
		"\7\2\2\35\5\3\2\2\2\36\37\7\4\2\2\37 \5\b\5\2 \'\b\4\1\2!\"\7\b\2\2\""+
		"#\5\b\5\2#$\b\4\1\2$&\3\2\2\2%!\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2"+
		"\2(\7\3\2\2\2)\'\3\2\2\2*+\7\4\2\2+/\b\5\1\2,-\7\5\2\2-/\b\5\1\2.*\3\2"+
		"\2\2.,\3\2\2\2/\t\3\2\2\2\60\61\5\4\3\2\61\62\b\6\1\2\62\64\3\2\2\2\63"+
		"\60\3\2\2\2\64\67\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\13\3\2\2\2\67"+
		"\65\3\2\2\2\6\31\'.\65";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}