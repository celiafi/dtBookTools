package dtBookTools.common;

/**
 * XML fragment creator for DTBook files.
 * 
 * @author jukkae
 *
 */
public class XMLFragmentCreator {
	
	/**
	 * Create image XML fragment
	 * @param imageFile the absolute path to file for which to create the img fragment
	 * @return img xml fragment corresponding to the input file
	 */
	public static String createImageFragment(String imageFile){
		String imageFragment = "<img xmlns='" + Constants.XMLNS + "' src='"
				+ imageFile + "' alt='kuva'/>\n";		
		return imageFragment;
	}
	
	/**
	 * Create page number XML fragment with 'page' set to default 'normal'
	 * @param pagenum the page number
	 * @return pagenum xml fragment corresponding to the page number
	 */
	public static String createPagenumFragment(String pagenum){

		return createPagenumFragment(pagenum, Constants.PagenumType.SPECIAL);
	}
	
	/**
	 * Create page number XML fragment
	 * @param pagenum the page number
	 * @param pagenumType page type: normal, front or special
	 * @return pagenum xml fragment corresponding to the page number
	 */
	public static String createPagenumFragment(String pagenum, Constants.PagenumType pagenumType){		
		String pagenumFragment = "<pagenum xmlns='" + Constants.XMLNS + "' id='page-"
				+ pagenum + "' page='" + pagenumType + "'>" + pagenum + "</pagenum>";
		return pagenumFragment;
	}

}
