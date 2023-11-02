package com.nirm;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTofile {

	public static void main(String[] args) {
		String content = "Java is very powerful programming platform";
		try {
		File file =  new File("mywritefile.txt");
		
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(content);
		System.out.println("Written in the file...");
		bw.close();
		fw.close();
			}
		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
