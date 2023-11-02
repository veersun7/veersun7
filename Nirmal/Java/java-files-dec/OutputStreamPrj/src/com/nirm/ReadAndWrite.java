package com.nirm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadAndWrite {

	public static void main(String[] args) throws IOException {
	
		FileInputStream in = null;
		FileOutputStream out = null;
		String cwd = System.getProperty("user.dir");
		
		System.out.println("The current working directory:"+ cwd);

		try {
		in = new FileInputStream("mywritefile.txt");
		out = new FileOutputStream("mywritefilecopy.txt");
		
		int  c =' ';
		while ((c=in. read())!=-1)
			out.write(c);
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}catch (IOException e) {
		e.printStackTrace();	
	}
		finally {
			if(in !=null) {
				in.close();
			}
			if (out != null) {
				out.close();
				
			}
		}
			}
		}
	
