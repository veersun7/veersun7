package com.nirm.myEmpHibPrj;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.nirm.myEmpHibPrj.entity.Employee;
import com.nirm.myEmpHibPrj.entity.ITSkill;
import com.nirm.myEmpHibPrj.entity.Laptop;
import com.nirm.myEmpHibPrj.entity.Name;



public class App 
{
	@SuppressWarnings("deprecation")
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Name n = new Name("Kamal","U","A");
        
        Employee e1 = new Employee();
        e1.setId(1008);
        e1.setEname(n);
        e1.setDept("IT");
        
        Laptop l1 = new Laptop();
        l1.setLid(111);
        l1.setLaptop("HP");
        
		e1.setLaptop(l1);
		
		
		List<ITSkill> skillList = new ArrayList<ITSkill>();
		
		ITSkill s1 = new ITSkill();
		
		s1.setS_id(105);
		s1.setS_name("Java");
		
		skillList.add(s1 );
		
		ITSkill s2 = new ITSkill();
		
		s2.setS_id(107);
		s2.setS_name("React");
		
		skillList.add(s2 );
		
		
		e1.setSkills(skillList);
        
        System.out.println(e1);
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class)
        													.addAnnotatedClass(Laptop.class)
        													.addAnnotatedClass(ITSkill.class);
        
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.save(l1);
        session.save(s1);
        session.save(s2);
        session.save(e1);
        tx.commit();
        
        System.out.println("Fetching a record ........");
        
        Employee e =  session.get(Employee.class, 1008);
       
        System.out.println("Data Fetched from table : " + e);
    }
}
