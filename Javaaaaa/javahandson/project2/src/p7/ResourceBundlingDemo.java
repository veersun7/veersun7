package p7;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundlingDemo {
	
	public static void main(String[] args) {
		ResourceBundle rs = ResourceBundle.getBundle("resources.message",Locale.getDefault());
		System.out.println(rs.getString("welcome"));
	};
}
