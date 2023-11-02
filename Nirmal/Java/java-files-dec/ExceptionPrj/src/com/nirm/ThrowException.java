package com.nirm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ThrowException() {}
	
	ThrowException(String str){
		super(str);
	}
	public static void main(String[] args) throws IOException{
try {
			
			InputStreamReader inStream = new  InputStreamReader(System.in);
			
			BufferedReader in = new BufferedReader(inStream);
			System.out.println("Enter the String");
			
			String str = new String(in.readLine());
			if(str.length()<8) {
				ThrowException me = new ThrowException ("String is less than 8");
				throw me;
			}else {
				System.out.println("String length is Greater than 8");
			}
		}
		catch (ThrowException me) {
			me.printStackTrace();
		}
	}

}