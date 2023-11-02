package p1;

// create a class numarray
// accept length of array and create array of that size
// accept all element and find the sum


public class NumArray {
	int arr[];
	int size;
	int sum1;
	
	public void read() {
		System.out.println("enter size of array you need to sum");
		size = Read.sc.nextInt();
		arr = new int[size];
			
	}
	public void acceptElements() {
		
		for(int i = 0; i < size ; i++) {
			System.out.println("enter element" + i);
			arr[i] = Read.sc.nextInt();
			
		}
	}
	public void printAllElement() {
		for(int i = 0 ; i < size ; i++) {
			System.out.print(arr[i] +" ");
			
		}
		System.out.println();
	}
	public void sumAllElement() {
		for(int i = 0 ; i < size ; i++) {
			sum1 = sum1 + arr[i];
			
		}
	}
	public void printSum() {
		System.out.println("total of all elements is "+sum1); 
	}
}
