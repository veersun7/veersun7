package p7;

import java.util.Locale;

public class Demo1 {

	public static void main(String[] args) {
		Locale lo[] = Locale.getAvailableLocales();
		for (Locale x : lo) {
			System.out.println(x);
		}
	}
}
