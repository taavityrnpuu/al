package ee.agri.alkor.util;

public class EscapeUtils {
	public static String escapeHTML(String html){
		String buffer = null;
		
		buffer = html.replace("'", "_");
		buffer = html.replace("�", "_");
		buffer = html.replace("+", "_");
		buffer = html.replace("-", "_");
		buffer = html.replace(",", "_");
		buffer = html.replace(".", "_");
		buffer = html.replace(";", "_");
		buffer = html.replace(":", "_");
		buffer = html.replace("?", "_");
		buffer = html.replace("\"", "_");
		buffer = html.replace("*", "_");
		buffer = html.replace("/", "_");
		buffer = html.replace("\\", "_");
		
		return buffer;
	}
	
	public static String unEscapeHTML(String html){
		return null;
	}
}
