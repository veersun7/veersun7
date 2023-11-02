package com.nirm.CollectionDI;


import java.util.List;
import java.util.Set;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        CollectionCl col = (CollectionCl) context.getBean("skillCollObj");
        List<Skill> l1= col.getSkillList();
        Set<Skill> s1= col.getSkillSet();
        System.out.println("List of skills :" + l1.toString());
        System.out.println("Set of skills :" + s1.toString());
    }
}