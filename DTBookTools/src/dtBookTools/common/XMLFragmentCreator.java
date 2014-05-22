package dtBookTools.common;

public class XMLFragmentCreator {
	
	public static String createImageFragment(String imageFile){		
		String imageFragment = "<img xmlns='" + Constants.XMLNS + "' src='"
				+ imageFile + "' alt=''/>";		
		return imageFragment;
	}
	

}
