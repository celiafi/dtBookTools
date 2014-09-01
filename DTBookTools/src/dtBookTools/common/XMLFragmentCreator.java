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
				+ imageFile + "' alt=''/>\n";		
		return imageFragment;
	}
	

}
