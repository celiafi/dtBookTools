package dtBookTools.common;

/**
 * Common DTBook-related constants
 * 
 * @author jukkae
 *
 */
public final class Constants {
	private Constants(){}
	
	/**
	 * Value of xmlns attribute
	 */
	public static final String XMLNS = "http://www.daisy.org/z3986/2005/dtbook/";
	
	public static enum PagenumType {
		NORMAL("normal"), FRONT("front"), SPECIAL("special");
		
		private String string;
		
		private PagenumType(String name){string = name;}
		
		public String toString(){
			return string;
		}
	};
}
