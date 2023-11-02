package p4;
import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<Integer> que = new LinkedList<>();
		que.add(90);
		que.add(80);
		que.add(70);
		que.add(60);
		
		System.out.println(que);
		int x = que.remove();
		System.out.println(x);
		System.out.println(que);
		x = que.remove();
		System.out.println(x);
		System.out.println(que);
		que.add(45);
		
		x = que.remove();
		System.out.println(x);
		System.out.println(que);
		x = que.remove();
		System.out.println(x);
		System.out.println(que);
		x = que.remove();
		System.out.println(x);
		System.out.println(que);
			
	}
}
