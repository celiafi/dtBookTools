package dtBookTools.caretOperations;

import java.awt.FileDialog;
import java.net.URL;

import javax.swing.JFrame;

import ro.sync.ecss.extensions.api.ArgumentDescriptor;
import ro.sync.ecss.extensions.api.ArgumentsMap;
import ro.sync.ecss.extensions.api.AuthorAccess;
import ro.sync.ecss.extensions.api.AuthorOperationException;
import dtBookTools.common.XMLFragmentCreator;

/**
 * Open file dialog and create an image xml fragment corresponding to the file.
 * 
 * @author jukkae
 * 
 */
public class InsertImageOperation implements
		ro.sync.ecss.extensions.api.AuthorOperation {

	/**
	 * Execute the operation.
	 * @param authorAccess from Oxygen
	 * @param arguments from Oxygen
	 * @throws IllegalArgumentException when called with illegal ArgumentsMap
	 * @throws AuthorOperationException if things go awry
	 */
	@SuppressWarnings("deprecation")
	@Override
	public void doOperation(AuthorAccess authorAccess, ArgumentsMap arguments)
			throws IllegalArgumentException, AuthorOperationException {

		JFrame oxygenFrame = (JFrame) authorAccess.getWorkspaceAccess()
				.getParentFrame();
		String href;

		URL currentLocation = authorAccess.getEditorAccess()
				.getEditorLocation();
		String loc = currentLocation.getPath();

		// Windows-only!
		if (loc.charAt(0) == '/')
			loc = loc.substring(1);
		loc = loc.substring(0, loc.lastIndexOf('/') + 1);
		loc = loc.replace("/", "\\");

		FileDialog fd = new FileDialog(oxygenFrame, "Insert image",
				FileDialog.LOAD);
		fd.setDirectory(loc);
		fd.setVisible(true);
		href = fd.getFile();

		if (href != null) {
			String imageFragment = XMLFragmentCreator.createImageFragment(href);

			int caretPosition = authorAccess.getEditorAccess().getCaretOffset();
			authorAccess.insertXMLFragment(imageFragment, caretPosition);
		}

	}

	/**
	 * Descriptor getter for Oxygen
	 */
	@Override
	public String getDescription() {
		String description = "Insert image pop-up operation";
		return description;
	}

	/**
	 * Argument descriptor for Oxygen
	 */
	@Override
	public ArgumentDescriptor[] getArguments() {
		ArgumentDescriptor[] argumentDescriptor = new ArgumentDescriptor[2];
		argumentDescriptor[0] = new ArgumentDescriptor("arg0", 0,
				"authorAccess");
		argumentDescriptor[1] = new ArgumentDescriptor("arg1", 0,
				"argumentsMap");
		return argumentDescriptor;
	}

}