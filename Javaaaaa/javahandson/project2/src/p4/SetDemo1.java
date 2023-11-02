package p4;
import java.util.*;

import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SetDemo1 {

	public static void main(String[] args) {
		
	
	Set<Integer> set1 = new HashSet<>(); // use Tree set for ordered list , linkedHashset for the below order	
	set1.add(15);
	set1.add(20);
	set1.add(30);
	set1.add(40);
	set1.add(50);
	
	System.out.println(set1);
	
	System.out.println("-------Size-------------");
	
	System.out.println(set1.size());
	
	System.out.println("---------Using index-----------");
	
//	for  (int i = 0;i<set1.size();i++) {
//	System.out.println(set1.get(i));
//}
// we cant access using index in set

	System.out.println("---------Special forloop--------");
	
	for (Integer x : set1) {
		System.out.println(x);
	}
	
	System.out.println("---------------Lamda----------");
	
	set1.forEach(System.out :: println);

	System.out.println("-----------Method of user defined (sqr)------------");
	
	set1.forEach(SetDemo1::f1);
	
	System.out.println("-----------Method without static (sqr root)-----");
	SetDemo1 obj = new SetDemo1();
	set1.forEach(obj::f2);
	
	System.out.println("---------Stream + Filters (<20)------------");
	set1.stream().filter((x)->(x<20)).forEach(System.out::println);
	
	System.out.println("-----------Stream + Filter + Count-------");
	int co = (int) set1.stream().filter((x)->x<20).count();
	System.out.println(co);
	
	System.out.println("-------------Extract based on filter---------------");
	Set<Integer> set2 = set1.stream().filter((x)->x<20).collect(Collectors.toSet());
	System.out.println(set2);
	
	System.out.println("---------------Iterator-------------");
	
	Iterator<Integer> it = set1.iterator();
	while(it.hasNext()) {
		Integer x = it.next();
		System.out.println(x);
		System.out.println(x);
	}
	System.out.println("---------------Sum using stream-------------");
	
	Integer sum = set1.stream().mapToInt(x->x).sum();
	System.out.println(sum);
	
	System.out.println("-------------Add---------------");
	// only work with LinkedHashSet
	set1.add(32);
	System.out.println(set1);
	
//	set1.add(0,19); cant add using index
	
	System.out.println("-------------Remove---------------");
	set1.remove(66); // specific element 
	System.out.println(set1);
	
	System.out.println("----------------------------");
	//sort,reverse,shuffle will not work
	System.out.println("-------------Remove all---------------");
	
	set1.clear();
	System.out.println(set1);
	
	}
	
public static void f1(Integer x) {
	System.out.println(x+"---->"+(x*x));
}

public void f2(Integer x) {
	System.out.println(x+"---->"+(Math.round(Math.sqrt(x))));
	
	}
}
		