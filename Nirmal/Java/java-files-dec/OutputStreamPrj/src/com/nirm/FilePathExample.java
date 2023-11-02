package com.nirm;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilePathExample {

	public static void main(String[] args) {
		
		Path path = Paths.get("C://Users//RBS//Output/stringoutputfile.txt");
	String content = "India is a beautiful country with rich heritage.";
byte[] bytes = content.getBytes();
try {
	Files.write(path,  bytes);
}catch (IOException e) {
	e.printStackTrace();
}
	}

}
