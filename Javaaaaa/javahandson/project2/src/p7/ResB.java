package p7;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResB {

	public static String getResource(String key) {
		
		ResourceBundle rs = ResourceBundle.getBundle("resources.message",Locale.getDefault());
		return rs.getString(key);
	}
}
