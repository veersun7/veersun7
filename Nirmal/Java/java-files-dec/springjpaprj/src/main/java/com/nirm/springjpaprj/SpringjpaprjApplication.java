package com.nirm.springjpaprj;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nirm.springjpaprj.entity.Expense;
import com.nirm.springjpaprj.repository.ExpenseRepository;

@SpringBootApplication
public class SpringjpaprjApplication implements CommandLineRunner {
	
	@Autowired
	private ExpenseRepository expenseRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringjpaprjApplication.class, args);
	}

	public void run(String... args ) throws Exception {
		
		expenseRepository.save(new Expense("Ticket",500));
		expenseRepository.save(new Expense("Cold Dring",180));
		expenseRepository.save(new Expense("Snacks",380));
		expenseRepository.save(new Expense("Fruits",450));
		
		Iterable<Expense> iter = expenseRepository.findAll();
		System.out.println("All Expense Item");
		
		iter.forEach(item->System.out.println(item));
		
		List<Expense> snacks = expenseRepository.findByItem("snacks");
		
		System.out.println("The Snacks ...:");
		snacks.forEach(s->System.out.println(s));
		
		List<Expense> expensiveItems = expenseRepository.listItemWithPriceOver(300);
		
		System.out.println("List of Expensive Items ...:");
		expensiveItems.forEach(ex->System.out.println(ex));
						
		
		
	}
}
