package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Demo4 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String filename;
			System.out.println("Enter Filename along with the path");
			filename = br.readLine();
			
			File f1 = new File(filename);
			if (f1.exists()) {
				System.out.println("File found");
				if (f1.isDirectory()) {
					System.out.println("Given is Directory");	
					String arr[]=f1.list();
					for (String x : arr) {
						System.out.println(x);
					}
			} else {
				System.out.println("Given is a File");
			}
			} else {
				System.out.println("File not found");	
			}
		} catch(Exception err) {
			
		}
	}
}
