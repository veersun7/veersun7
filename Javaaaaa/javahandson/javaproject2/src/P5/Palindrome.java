package P5;

import p1.Read;

public class Palindrome {

	public static void main(String[] args) {
		String name;
		System.out.println("enter a name");
		name = Read.sc.next();
		Singlelinkedlist root = null, root1 = null;
		Singlelinkedlist cob=null, cob1=null, ob=null, ob1 = null;
		int flag = 0;
		for (int i=0;i<name.length();i++) {
		ob = new Singlelinkedlist();
			ob.c = name.charAt(i);
			ob.nextobj=null;
			ob1=new Singlelinkedlist();
			ob1.c = name.charAt(i);
			ob1.nextobj= null;
			
			if (flag==0) {
				root = ob;
				root1 = ob1;
				cob = ob;
				cob1 = ob1;
				flag=1;
			}
			
				else {
         cob.nextobj=ob;// queue construction
         ob1.nextobj=cob1;// linking to stack
         root1=ob1;
         cob=ob;
         cob1 = ob1;
			}
			
								
		}
		while(root != null) {
			System.out.println(root.c + " 	"+root1.c);
			if(root.c!=root1.c) {
				flag = 0;
				
			}
			root = root.nextobj;
			root1 = root1.nextobj;
			
			
	}
		if (flag==3) {
			System.out.println("not a palindrome");
		}
			else
			{
				System.out.println("is a palindrome");
		}
				
		}
}
