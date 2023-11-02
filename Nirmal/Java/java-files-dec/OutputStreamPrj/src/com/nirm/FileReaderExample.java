package com.nirm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class FileReaderExample {

	public static void main(String[] args) {
		File file = new File("C://Users//RBS//Output/stringoutputfile.txt");
	
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
				String str;
				while ( (str = br.readLine()) !=null)
				System.out.println(str);
				
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
