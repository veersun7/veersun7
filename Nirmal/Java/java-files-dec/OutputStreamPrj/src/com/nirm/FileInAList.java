package com.nirm;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FileInAList {

	public static void main(String[] args) {
		List<String> myList = readFileInList("C://Users//RBS//Output/stringoutputfile.txt");
		Iterator <String>iter = myList.iterator();
		while (iter.hasNext())
			System.out.println(iter.next());

	}
	private static List<String> readFileInList(String filename){
		List<String> list1=Collections.emptyList();
		try {
			list1=Files.readAllLines(Paths.get(filename), StandardCharsets.UTF_8);
		}catch (IOException e) {
			e.printStackTrace();
		}
		return list1;
	}
	

}
