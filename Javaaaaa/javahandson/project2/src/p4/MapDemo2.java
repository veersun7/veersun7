package p4;
import java.util.*;

public class MapDemo2 {

public static void main(String[] args) {
		
		// Take a sentence and find frequency of word (each word how many time it is there)
		
		String sen = "Static method cannot directly call non static method we can only after object creation but static method can call another static method directly";
		
		Map<String, Integer> c = new LinkedHashMap<>();
		for ( String x : sen.split(" ")) {
			try {
				
				Integer count = c.get(x);
				count++;
				
				c.put(x, count);
				
			}catch (Exception e) {
				c.put(x,1);
			}
		}
		System.out.println(c);
}
}
