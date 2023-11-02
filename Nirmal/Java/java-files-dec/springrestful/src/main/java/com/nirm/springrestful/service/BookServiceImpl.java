package com.nirm.springrestful.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.nirm.springrestful.model.Book;

@Service
public class BookServiceImpl implements BookService {

	
	@Override
	public List<Book> findAll(){
		List<Book> bookList = new ArrayList<Book>();
		bookList.add(new Book(1,"Secret","Rhonda Byrne", 625));
		bookList.add(new Book(2,"Power","Rhonda Byrne", 550));
		bookList.add(new Book(3,"Alchemist","Khalad Hosseiny", 470));	
		bookList.add(new Book(4,"Kashi","Verma Raj", 399));
		bookList.add(new Book(4,"pralay","Vineet Bajpai", 345));
		return bookList;
		
	}
}
