package com.nirm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;

public class ArrayToCollection {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader inStream = new InputStreamReader(System.in);
		BufferedReader in = new BufferedReader(inStream);
		
		System.out.println("How many elements you want to add to the array:");

		int n = Integer.parseInt(in.readLine());
		
		String[] names = new String[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter the" + (i+1) +"th name:");
			names[i] = in.readLine();
		}
		List<String> namesList = Arrays.asList(names);
	for(String li : namesList) {
		System.out.println(li+" ");
	}
			}

}
