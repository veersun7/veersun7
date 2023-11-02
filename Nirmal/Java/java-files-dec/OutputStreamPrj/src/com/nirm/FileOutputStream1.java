			package com.nirm;
			
			import java.io.FileNotFoundException;
			import java.io.FileOutputStream;
			import java.io.IOException;
			
			public class FileOutputStream1 {
				
				public static void main(String[] args) {
					
					try {
						/*
						 * FileOutputStream fout = new FileOutputStream
						 * ("C://Users//RBS//Output/outputfile1.txt");
						 * 
						 * fout.write(65); fout.close();
						 */
					//65-91 is A-Z(ASCII code)
					//97-115 is a-z(ASCII code)
					FileOutputStream fstrtOut = new FileOutputStream ("C://Users//RBS//Output/stringoutputfile1.txt");
					String s= "Welcome to java io streams";
					
					byte b[] = s.getBytes();
					fstrtOut.write(b);
					fstrtOut.close();
					
					System.out.println("Written in file Successfully...");
					
					}catch (FileNotFoundException e) {
						e.printStackTrace();
						
					}catch (IOException e) {
					e.printStackTrace();
				}
			
			}
			}