package P5;

import p1.Read;

public class Revstringinstack {

		public static void main(String[] args) {
			
			String name;
			String name1="";
			System.out.println("Enter name");
			name = Read.sc.nextLine();
			char arr[]=new char[name.length()];
			int sp = -1;
			for(int i = 0;i<name.length();i++) {
				sp ++;
				arr[sp]=name.charAt(i);
						
			}
			// pop all the char
			while(sp !=-1) {
				name1 = name1 + arr[sp];
				sp--;
				
			}
			System.out.println("Reverse is "+ name1);
			
			if(name.equals(name1)) {
				System.out.println("polindrom");
			}
			else
			{
				System.out.println("not polindrom");
			}
		}
	}

