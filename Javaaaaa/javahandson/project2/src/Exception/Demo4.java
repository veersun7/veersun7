package Exception;

import java.util.Scanner;

class InsufficentBalance extends Exception {
	public InsufficentBalance() {
		super("Balance not sufficent, Your transaction is cancelled");	
	}	
}

public class Demo4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		try {
			int balance = 100000;
			System.out.println("Enter amount to withdraw");
			int amt = sc.nextInt();
			
			if(amt>balance) {
				throw new InsufficentBalance();
			}
			System.out.println("Please Wait, Your Transaction is under process");
			
		}catch(InsufficentBalance e) {
			System.out.println(e.getMessage());
		}
	}
	

}
