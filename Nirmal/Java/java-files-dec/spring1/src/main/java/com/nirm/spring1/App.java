package com.nirm.spring1;

//import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.core.io.Resource;*/
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
		/*
		 * Resource resource = new ClassPathResource("applicationContext.xml");
		 *
		 * BeanFactory factory = new XmlBeanFactory(resource);
		 */
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee emp1 = (Employee) context.getBean("empbean");
        System.out.println(emp1);
        Employee emp2= (Employee) context.getBean("empbean2");
 		 
        System.out.println(emp2);
		   Employee emp3= (Employee) context.getBean("empbean3");
	 		 
		   emp3.merge();
    }
}