package com.nirm;

public class MyException extends Exception{

	
		static int[] accno = {101, 102, 103, 104};
		static String[] name = {"Amit", "Dheena", "Raghul", "Sudha"};
		static double[] balance = {1000.00, 12000.0,8000.0,7000.5};
		
		MyException() {}
		
		MyException(String str){
			super(str);
		}
		public static void main(String[] args) {
			
			try {
				System.out.println("AccNo" + "\t" + "Name" + "\t" + "Balance");
				for(int i=0;i<4;i++)
				{
					if(balance[i] < 1000) {
						MyException me = new MyException("Balance below 1000");
						throw me;
						}
					System.out.println(accno[i]+"\t"+ name[i] +"\t" + balance[i] );
				}
					
			}
		catch(MyException me)	{
			me.printStackTrace();
		}
		
	}

}
