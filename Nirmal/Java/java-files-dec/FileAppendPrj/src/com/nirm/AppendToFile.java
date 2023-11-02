package com.nirm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;

public class AppendToFile {

	public static void main(String[] args) {
		String filePath = "C://Users//RBS//Output/stringoutputfile.txt"; 
String appendStr = "Adding yet another line";

appendWithFileWriter(filePath,appendStr);

String newStr = "String added using FileOutputStream.";

appendWithFOStream (filePath,newStr);

appendWithBufferedWriter (filePath, "New text", 3);

}
private static void appendWithFileWriter(String filePath, String appendStr) {
File file = new File (filePath);
FileWriter fw = null;
BufferedWriter bw = null;
PrintWriter pw =  null;

try {
	fw = new FileWriter (file,true);
	bw = new BufferedWriter (fw);
	pw = new PrintWriter(bw);
	pw.println(appendStr);
}

catch (IOException e ) {
	e.printStackTrace();
}
finally {
	try {
		pw. close();
		bw.close();
		fw.close();
	} catch (IOException e ) {
		e.printStackTrace();
	}
}

}

private static void appendWithFOStream(String filePath, String data) {

OutputStream os = null;

try {
	os = new FileOutputStream(new File(filePath),true);
	os.write(data.getBytes(),0,data.length());
} catch (FileNotFoundException e) {
	e.printStackTrace();
} catch (IOException e) {
	e.printStackTrace();
}
finally {
	try {
		os.close();
	}catch (IOException e) {
		e.printStackTrace();
	}
}
	
	


}
private static void appendWithBufferedWriter (String filePath, String text, int noOfLines) {

File file = new File (filePath);
FileWriter fw =null;
BufferedWriter bw = null;

try {
	fw = new FileWriter (file,true);
	bw = new BufferedWriter (fw);
	for (int i=0;i<noOfLines;i++) {
		bw.newLine();
		bw.write(text);
	}
} catch (IOException e) {
	e.printStackTrace();
}
finally {
	try {
		bw.close();
		fw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
}

}

}