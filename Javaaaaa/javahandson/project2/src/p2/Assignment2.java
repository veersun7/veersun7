package p2;

import java.util.Scanner;

public class Assignment2 {
	
	String phonenumber = "";
	int flag;
	
	private Scanner sc;

	public Assignment2() {
		super();
		sc = new Scanner(System.in);
		System.out.println("I am in constructor");
	}
	
	public void getNumber() {
		this.phonenumber = sc.nextLine().trim();
	}
	
	public void validateNumber() {
		if (this.phonenumber.equals("") ) {
			this.flag = -1;
		}
		
		int countDigit = 0;
		for ( char ch: this.phonenumber.toCharArray()) {
			
			if (ch == '-' ) {
				continue;
			
			}
			if (!Character.isDigit(ch)) {
				this.flag = 0;
				return;
			}
			countDigit++;
		}
		if(countDigit !=10) {
			this.flag = 0;
		}else {
			this.flag = 1;
		}
	}
	
	public void displayResult() {
		if (this.flag == -1) {
			System.out.println("Blank");
		}else if(this.flag == 0) {
			System.out.println("Invalid");
		}else {
			System.out.println("Valid");
		}
	}
	
	public static void main(String[] args) {
		Assignment2 obj = new Assignment2();
		obj.getNumber();
		obj.validateNumber();
		obj.displayResult();
	}

}

