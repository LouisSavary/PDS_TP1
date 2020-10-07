package TP1;

import java.util.List;

public class ASD {
  static public class Document {
    
	private String ast;
	  
	public Document(String arg) {
		ast = arg;
	}
	
    public String toNtriples() {
    	return ast;
    }
    
  }
}
