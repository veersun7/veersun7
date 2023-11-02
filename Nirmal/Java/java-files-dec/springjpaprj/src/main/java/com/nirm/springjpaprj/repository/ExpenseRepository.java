package com.nirm.springjpaprj.repository;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.nirm.springjpaprj.entity.Expense;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
	
	public List<Expense> findByItem(String Item);
	
	@Query("select e from Expense e where e.amount >= :amount")
	public List<Expense> listItemWithPriceOver(@Param("amount") double amount);
	
	
	
}
