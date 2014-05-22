package dtBookTools.caretOperations;

import java.awt.FileDialog;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;

import ro.sync.ecss.extensions.api.ArgumentDescriptor;
import ro.sync.ecss.extensions.api.ArgumentsMap;
import ro.sync.ecss.extensions.api.AuthorAccess;
import ro.sync.ecss.extensions.api.AuthorOperation;
import ro.sync.ecss.extensions.api.AuthorOperationException;
import dtBookTools.common.Constants;
import dtBookTools.common.XMLFragmentCreator;

public class InsertImageOperation implements
		ro.sync.ecss.extensions.api.AuthorOperation {

	@Override
	public String getDescription() {
		String description = "Insert image pop-up operation";
		return description;
	}

	@Override
	public void doOperation(AuthorAccess authorAccess, ArgumentsMap arguments)
			throws IllegalArgumentException, AuthorOperationException {

		JFrame oxygenFrame = (JFrame) authorAccess.getWorkspaceAccess()
				.getParentFrame();
		String href;

		URL currentLocation = authorAccess.getEditorAccess()
				.getEditorLocation();
		String loc = currentLocation.getPath();
		assert (loc != null);
		
		//TODO use file separators instead of characters
		//TODO verify assertions
		if(loc.charAt(0) == '/')loc = loc.substring(1);	
		loc = loc.substring(0, loc.lastIndexOf('/')+1);
		loc = loc.replace("/", "\\");

		FileDialog fd = new FileDialog(oxygenFrame, "Insert image", FileDialog.LOAD);
		fd.setDirectory(loc);
		fd.setVisible(true);
		href = fd.getFile();

		if (href != null) {
			String imageFragment = XMLFragmentCreator.createImageFragment(href);
			
			int caretPosition = authorAccess.getEditorAccess().getCaretOffset();
			authorAccess.insertXMLFragment(imageFragment, caretPosition);
		}

	}


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