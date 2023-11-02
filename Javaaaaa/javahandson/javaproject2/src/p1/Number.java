package p1;

public class Number {
int num1;

public void read() {
	System.out.println("Enter n value ");
			num1 = Read.sc.nextInt();
			
}
public void pyramid() {
	
	for(int i = 1; i <= num1 ; i++) {
		
		for (int j = 1 ; j<= i;j++) {
			System.out.print(j);
		}
			System.out.println(); 
		}
	}
public void mtable() {
	for( int i = 1; i <=10;i++) {
		System.out.println(num1 + " X " + i + " = " + (num1 *i));
				
	}
}

public void checkprime() {
	
	int flag = 0;
	for(int i = 2;i<=num1/2;i++) {
		if(num1 %i == 0) {
			flag =1;
		}
	}
	if(flag == 0) {	
		System.out.println("prime number");
	}
	else {
		System.out.println("Not a prime number");
	}
}
}

