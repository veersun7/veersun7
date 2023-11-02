package com.nirm.springrestful.controller;

import java.util.List;
import com.nirm.springrestful.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nirm.springrestful.model.Book;

@RestController

@RequestMapping("/api")
public class BookController {
	
	
	@Autowired
	private BookServiceImpl bookService;
	@GetMapping(value="/book")
public List<Book> getBook(){
	List<Book> li = bookService.findAll();
	return li;
}
}
