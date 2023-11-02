package com.nirm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileScannerCl {

	public static void main(String[] args) {
		File file = new File("C://Users//RBS//Output/stringoutputfile.txt");

				
				try {
					Scanner sc=new Scanner(file);
					System.out.println(sc.next());
					while (sc.hasNextLine())
						System.out.println(sc.nextLine());
				}catch (FileNotFoundException e) {
					e.printStackTrace();
				}
	}
				
	}


