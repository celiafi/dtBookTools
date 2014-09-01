package dtBookTools.dndActions;


import java.io.File;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import dtBookTools.common.XMLFragmentCreator;
import ro.sync.ecss.extensions.api.AuthorAccess;
import ro.sync.ecss.extensions.api.AuthorOperationException;

public class ImageDnd extends ro.sync.ecss.extensions.api.AuthorExternalObjectInsertionHandler {

	
	/**
	 * Descriptor getter for Oxygen
	 */
	@Override
	public String getDescription() {
		String description = "Drag and drop operations for DTBooks.";
		return description;
	}
	
	public void insertURLs(AuthorAccess authorAccess, java.util.List<java.net.URL> urls, int source){
		JFrame oxygenFrame = (JFrame) authorAccess.getWorkspaceAccess()
				.getParentFrame();
		
		String currentEditorLocation = authorAccess.getEditorAccess().getEditorLocation().getPath();
		
		
		for(int i = 0; i < urls.size(); i++){
			@SuppressWarnings("deprecation")
			int offset = authorAccess.getCaretOffset();
						
			URL url = urls.get(i);
			String path = url.getPath();
			
			File e = new File(currentEditorLocation);
			File f = new File(path);
			
			String eDir = e.getParent();
			String fDir = f.getParent();

			//if in editor directory, use only name, otherwise full path 
			if (eDir.equals(fDir)){
				path = f.getName();
			}
			try {
				authorAccess.getDocumentController().insertXMLFragmentSchemaAware(XMLFragmentCreator.createImageFragment(path), offset);
			} catch (AuthorOperationException ex) {
				JOptionPane.showMessageDialog(oxygenFrame, "There was an unknown error.");
				ex.printStackTrace();
			}
		}
		

			

	}


}
