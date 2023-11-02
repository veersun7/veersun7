package com.example.demo.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.Users;

@SpringBootTest
class UsersRepositoryTest {

	@Autowired
	UsersRepository URepo; 
	Users Users;

	List<Users> UsersList = new LinkedList<>();
	
	@BeforeEach
	void setUp() throws Exception {		
		Users = new Users();
		Users.setEmail("dilli@gmail.com");	
		Users.setName("dilli");
		Users.setAccountNo((long) 1234567890);				
		Users.setMobileNo((long) 1234567890);
		Users.setPassword("Rivi123*");
		
	}

	@AfterEach
	void tearDown() throws Exception {
		URepo.deleteAll();
		URepo = null;
		
	}

	@Test
	void testFindAll() {
		
		Users Users = new Users("dilli@gmail.com","DilliGanesh",(long) 1234567890,(long) 1234567890,"Rivi123*" );
		Users Users1 = new Users("nirmal@gmail.com","Nirmalbabu",(long) 1234567891,(long) 1234567891,"Rivi123*" );
		URepo.save(Users);
		URepo.save(Users1);

       List<Users> blogList = (List<Users>)  URepo.findAll();
       assertEquals("nirmal@gmail.com", blogList.get(1).getEmail());
	}
       
	}


