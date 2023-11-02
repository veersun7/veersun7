package p5;

import java.util.Optional;

import java.util.function.Predicate;

import p3.StudentTo;

public class Demo3 {
	
	public static void main(String[] args) {
		Predicate<Integer> pre = (x)->(x>100);
		System.out.println(pre.test(55));
		
		Predicate<StudentTo> pre1 = (x)->(x.getFname().charAt(0) == 'A');
		StudentTo st = new StudentTo("s003","Joe","jim","Kerala","09-09-1992");
	//	System.out.println(pre1.test(st));
		
		Optional<StudentTo> op1 = Optional.of(st);
		System.out.println(op1.isPresent());
		
		System.out.println(op1.get());
	}

}