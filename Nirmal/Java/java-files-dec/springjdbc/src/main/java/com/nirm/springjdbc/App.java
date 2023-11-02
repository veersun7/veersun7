package com.nirm.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("Beans.xml");
    
    
    StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) ctx.getBean("StudentJDBCTemplate");
    
    System.out.println("-------Record Creation-------");
    studentJDBCTemplate.create("Radha " , 18);
    studentJDBCTemplate.create("Kumar ", 38);
    studentJDBCTemplate.create("Nandha ", 28);
    
    System.out.println("-------Listing multiple records-------");
    List<Student> students = studentJDBCTemplate.listStudents();
    for (Student r : students) {
    	System.out.println(r.getId()+" " + r.getName()+" "+r.getAge());
    	   
    }
    System.out.println("-------Updating record for id 3-------");
    studentJDBCTemplate.update(3, 28);
    System.out.println("-------Displaying record for id 3-------");
    Student s = studentJDBCTemplate.getStudent(3);
    System.out.println(s.getId()+" " + s.getName()+" "+s.getAge());
    System.out.println("-------Deleting record for id 6-------");
    studentJDBCTemplate.delete(6);
    
    System.out.println("-------Listing multiple records after update and delete-------");
    students = studentJDBCTemplate.listStudents();
    for (Student r : students) {
    	System.out.println(r.getId()+" " + r.getName()+" "+r.getAge());
    	   
    }
    
    }
}
