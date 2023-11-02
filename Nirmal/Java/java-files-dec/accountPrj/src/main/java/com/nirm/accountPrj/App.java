package com.nirm.accountPrj;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new AnnotationConfigApplicationContext(AccountConfig.class);
        CreditCard CC = context.getBean(CreditCard.class);
        CC.setCredit("8000");
        CC.getCredit();
        DebitCard DC = context.getBean(DebitCard.class);
        DC.setDebit("5000");
        DC.getDebit();
    }
}