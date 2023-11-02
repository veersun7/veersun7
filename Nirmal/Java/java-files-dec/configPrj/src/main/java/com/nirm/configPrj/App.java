package com.nirm.configPrj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MyMessage.class);
    
        		
        		MyMessage myMsg = ctx.getBean(MyMessage.class);
        		myMsg.setMessage ("Hi everyone");
        		  myMsg.getMessage();
    }
    
    	}

