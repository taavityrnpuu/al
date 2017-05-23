package ee.agri.alkor.xtee;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Messages  {

	private static ResourceBundle bundle;
	
	static {
		bundle = ResourceBundle.getBundle("messages", new Locale("et"));
	}
	
	public static String getMessage(String key) {
		return bundle.getString(key);
	}
	
	public static String getMessage(String key, Object arg) {
		String pattern = bundle.getString(key);
		return MessageFormat.format(pattern, arg);
	}
}
