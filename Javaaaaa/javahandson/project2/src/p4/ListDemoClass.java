package p4;

import java.util.*;
import java.util.stream.Collectors;

public class ListDemoClass {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(); // this is a tightly coupled technique
		// because LHS and RHS are of same class type. Hence LHS can't refer to any other class
		// Hence this is called tightly coupled and static polymorphism.
		
		List<Integer> list1 = new ArrayList<>(); // This is loosely coupled technique
		// since LHS is of interface type which can refer to different classes under it
		// Hence this is called loosely coupled technique which is also called run time polymorphism
		
		list1.add(10);
		list1.add(22);
		list1.add(14);
		list1.add(65);
		list1.add(14);
		
		System.out.println(list1);
		//displaying or accessing list using index 
		
System.out.println("---------Using Index-----------");
		
		for (int i = 0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
System.out.println("---------Using Special For Loop-----------");
		
		for (Integer x : list1 ) {
			System.out.println(x);
		}
		
System.out.println("---------Using Lambda expression, streaming and method reference-----------");
		
		list1.forEach(System.out::println); // :: is called as scope resolution operator
		// Scope resolution means, to which class the println belongs to 
		
System.out.println("-------Method reference of user defined static method-------");
		
		list1.forEach(ListDemoClass::f1); 
		
System.out.println("-------Method reference of user defined instance method-------");
		
		ListDemoClass obj = new ListDemoClass();
		list1.forEach(obj::f2);
		
		//Streaming is a process of performing certain things parallely 
		// Java supports stream API where we can do parallel programming or a collections
		
System.out.println("-------Method reference + Streaming + Filters-------");
		//Display all the elements which is greater than 20
		
		list1.stream().filter((x)->(x>20)).forEach(System.out::println);
		
System.out.println("-------Streaming + Filters + counts-------");
		//Display how many elements are greater than 20 and lesser than 20
		
		int c =(int) list1.stream().filter((x)->(x>20)).count();
		System.out.println("Greater than 20 is "+c + "\nLess than 20 is "+ (list1.size()-c));
		
System.out.println("-------Extracting elements from collection based on filters-------");
		//Extract all the elements which are greater than 20 
		
		List<Integer> l1 = list1.stream().filter((x)->(x>20)).collect(Collectors.toList());
		l1.forEach(System.out::println);
		
System.out.println("-----------Iterating element using itterator class------------");
		// iterator will take copy of list or any collection and navigate in forward direction
		// when we are navigating in iterator, we cant do any change in collection

		Iterator<Integer> it = list1.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
System.out.println("-----------Using Iterator, print the elements 2 times------------"); // using 'is' here because it dint allow me to use 'IT' twice which is already used above
		Iterator<Integer> is = list1.iterator();
		while (is.hasNext()) {
			Integer b1 = is.next();
			System.out.println(b1);
			System.out.println(b1);
		}
		
System.out.println("-----------Using Stream and map, sum all the elements-----------");	

	Integer sumall = list1.stream().mapToInt((x)->(x)).sum();
	System.out.println(sumall);
	
	
System.out.println("------------Sum all the elements greater than 20 using stream and map----------");
	Integer sum1 = list1.stream().filter((x)->(x>20)).mapToInt((x)->(x)).sum();
	System.out.println(sum1);

System.out.println("-------Add element at the bottom--------");
	list1.add(35);
	System.out.println(list1);
	
System.out.println("-------Add element at the top------------");
	list1.add(0,66); // 0 is a index and 66 is 
	System.out.println(list1);
	
System.out.println("--------Add element in between---------");
	list1.add(3,90);
	System.out.println(list1);

System.out.println("----------Remove element at bottom--------");
	list1.remove(list1.size()-1);
	System.out.println(list1);
	
System.out.println("----------Remove element at top--------");
	list1.remove(0);
	System.out.println(list1);


System.out.println("----------Remove element in between using value--------");
list1.remove(list1.indexOf(14));
System.out.println(list1);


System.out.println("----------Remove element in between using value--------");
list1.remove(new Integer(14));//this is not recommended
System.out.println(list1);

System.out.println("------sort all elements in increasing order-----");

// in java collections, collection is interface where as collections is an algorithm which contains certain logic
Collections.sort(list1);
System.out.println(list1);

System.out.println("------sort all elements in decreasing order-----");

Collections.reverse(list1);
System.out.println(list1);

System.out.println("-------shuffle all the elements------");

Collections.shuffle(list1);
System.out.println(list1);

System.out.println("-------remove all the elements------");

list1.clear();
System.out.println(list1);


	}
	
	public static void f1(Integer x) {
		System.out.println(x+"--------->"+(x*x));
	}
	
	public void f2(Integer x) {
		System.out.println(x+"----------->"+(Math.round(Math.sqrt(x))));
		
	}
	
}
