package com.nirm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExcep {
	
	public static void main(String[] args){
		
		File myFiles = new File("C://Users//RBS/mytext.txt");
		try {
		FileReader fr = new FileReader(myFiles);
		System.out.println("File found");
	} catch (FileNotFoundException e)	{
		e.printStackTrace();
		System.out.println("File not Found");
	}
	}
}
