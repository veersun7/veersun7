package files;

import java.io.*;
import java.util.*;

public class Demo3 {
	
	public static void main(String[] args) {
		
		try {
			FileReader f1 = new FileReader("/home/ubuntu/Desktop/newgit/gitdemoproject/javahandson/project2/src/files/message.properties");
			Properties p = new Properties();
			
			p.load(f1);
			
			System.out.println(p.getProperty("m1"));
			
		} catch(Exception err) {
			System.err.println(err);
		}
	}

}
