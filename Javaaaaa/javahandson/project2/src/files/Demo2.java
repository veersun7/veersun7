package files;

import java.io.*;

public class Demo2 {

	public static void main(String[] args) {
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String filename;
		System.out.println("Enter Filename along with the path");
		filename = br.readLine();
		
		String newfilename;
		System.out.println("Enter Filename along with the path");
		newfilename = br.readLine();
		
		BufferedReader fr = new BufferedReader(new FileReader(filename));
		BufferedWriter fw = new BufferedWriter(new FileWriter(newfilename));
		
		String line;
		while ((line = fr.readLine())!=null) {
//			if(line.contains("System.out")) {
//			System.out.println(line);	
//		}
			
			fw.write(line);
			fw.newLine();
			
		}
		
		fr.close();
		fw.close();
		System.out.println("File Copied");
		
	} catch (Exception err) {
		
		System.out.println(err);
	}
		
}

}
