package dtBookTools.caretOperations;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import dtBookTools.common.XMLFragmentCreator;
import ro.sync.ecss.extensions.api.ArgumentDescriptor;
import ro.sync.ecss.extensions.api.ArgumentsMap;
import ro.sync.ecss.extensions.api.AuthorAccess;
import ro.sync.ecss.extensions.api.AuthorOperationException;

public class InsertPagenumOperation implements
		ro.sync.ecss.extensions.api.AuthorOperation {

	

	@SuppressWarnings("deprecation")
	@Override
	public void doOperation(AuthorAccess authorAccess, ArgumentsMap arg1)
			throws IllegalArgumentException, AuthorOperationException {
		
		JFrame oxygenFrame = (JFrame) authorAccess.getWorkspaceAccess()
				.getParentFrame();
		
		String pagenumFragment = "TEST";

		String s = (String)JOptionPane.showInputDialog(
                oxygenFrame,
                "Page number:",
                "Insert page number",
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                "");
		if(!s.isEmpty()) pagenumFragment = XMLFragmentCreator.createPagenumFragment(s);
		
		int caretPosition = authorAccess.getEditorAccess().getCaretOffset();
		authorAccess.insertXMLFragment(pagenumFragment, caretPosition);
	}

	@Override
	public String getDescription() {
		String description = "Insert DTBook page number";
		return description;
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
