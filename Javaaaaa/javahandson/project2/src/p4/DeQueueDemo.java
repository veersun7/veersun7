package p4;
import java.util.*;
public class DeQueueDemo {
	
	public static void main(String[] args) {
		
		Deque<Integer> dq = new ArrayDeque<>(); // We can use LinkedList also instead of ArrayDeque, same results
		dq.add(10);
		System.out.println(dq);
		dq.add(20);
		System.out.println(dq);
		int x = dq.remove();
		System.out.println(x);
		System.out.println(dq);
		dq.push(30);
		System.out.println(dq);
		x = dq.pop();
		System.out.println(x);
		System.out.println(dq);
		
		dq.add(40);
		dq.push(45);
		System.out.println(dq);
	}

}
