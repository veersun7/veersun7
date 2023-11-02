package com.nirm.constrDI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
        Customer c= (Customer) context.getBean("Customer");
        c.transact();
        
        System.out.println( "All args Constructor.... " );
        
        Customer c1= (Customer)context.getBean("Customer");
        c1.transact();
    }
    
}
