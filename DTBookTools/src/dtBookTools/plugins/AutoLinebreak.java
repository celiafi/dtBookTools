package dtBookTools.plugins;

import ro.sync.exml.plugin.Plugin;
import ro.sync.exml.plugin.PluginDescriptor;

public class AutoLinebreak extends Plugin {

	private static AutoLinebreak instance = null;
	
	public AutoLinebreak(PluginDescriptor descriptor) {
		super(descriptor);
		if (instance != null) {
			throw new IllegalStateException("Already instantiated.");
		}
		instance = this;
	}
	
	public static AutoLinebreak getInstance() {
		return instance;
	}

}
