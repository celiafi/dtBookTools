package dtBookTools.plugins;

import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

import ro.sync.exml.plugin.document.DocumentPluginContext;
import ro.sync.exml.plugin.document.DocumentPluginExtension;
import ro.sync.exml.plugin.document.DocumentPluginResult;

public class AutoLinebreakExtension implements DocumentPluginExtension {

	@Override
	public DocumentPluginResult process(DocumentPluginContext context) {
		Document document = context.getDocument();
		// TODO modify document
		return null;
	}

}
