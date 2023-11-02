package p4;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import p3.StudentTo;

public class StudentDemo {
	
	public static void main(String[] args) {
		
		List<StudentTo> studentList = Collections.synchronizedList(new LinkedList<>());
		studentList.add(new StudentTo("s001","Sam","Jake","Mumbai","27-06-1998"));
		studentList.add(new StudentTo("s002","Vishal","V","Delhi","18-05-1998"));
		studentList.add(new StudentTo("s003","Raj","Kumar","Mumbai","27-05-1998"));
		studentList.add(new StudentTo("s004","Ramu","Kumar","Mumbai","27-05-1998"));
		
		// To get the list of all the students
		
		studentList.forEach(System.out::println);
		
		// To get the list of all first names of the students
		
		studentList.stream().map((x)->(x.getFname())).forEach(System.out::println);
		
		// To get the list of count of students who belongs to Mumbai
		
		int co = (int) studentList.stream().filter((x)->(x.getCity().equals("Mumbai"))).count();
		System.out.println(co);
		
		// to display the student details of those whose city is Mumbai
		
		studentList.stream().filter((x)->(x.getCity().equals("Mumbai"))).forEach(System.out::println);
		
		//To get the fname of students whose city is mumbai
		
		studentList.stream().filter((x)->(x.getCity().equals("Mumbai"))).map((x)->(x.getFname())).forEach(System.out::println);
		
		// To get the student details of whose city belongs to Delhi
		
		List<StudentTo> l1 = studentList.stream().filter((x)->(x.getCity().equals("Delhi"))).collect(Collectors.toList());
		System.out.println(l1);
		
	}

}
