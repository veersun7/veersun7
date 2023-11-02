package com.nirm;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream1 {

	public static void main(String[]args) {
		try {
		FileInputStream fin = new FileInputStream ("C://Users//RBS//Output/outputfile1.txt");
			int i = fin.read();
			
			System.out.println((char) i);
			fin.close();
			FileInputStream fstrIn = new FileInputStream ("C://Users//RBS//Output/stringoutputfile1.txt");
			while ( (i= fstrIn.read())!=-1) {
				System.out.print((char) i);
			}
			fstrIn.close();
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}	catch (IOException e) {
		e.printStackTrace();
	}
	}
}
