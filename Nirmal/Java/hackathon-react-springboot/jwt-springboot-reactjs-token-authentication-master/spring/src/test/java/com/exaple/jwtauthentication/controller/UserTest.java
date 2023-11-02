package com.exaple.jwtauthentication.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.jwtauthentication.controller.AuthRestAPIs;
import com.example.jwtauthentication.model.User;
import com.example.jwtauthentication.repository.UserRepository;

@TestMethodOrder(OrderAnnotation.class)
@ComponentScan(basePackages = "com.example.jwtauthentication.controller")
@AutoConfigureMockMvc
@ContextConfiguration
@SpringBootTest(classes = { UserTest.class })

public class UserTest {
	

	
	@Autowired
	MockMvc mockMvc;
	
	@Mock
	UserRepository userRepository;
	
	@InjectMocks
	AuthRestAPIs authrestapi;

		
	List<UserDetails> myuserdetails; 
	Optional<User> userdetails;
	
	@BeforeEach
	public void setUp()
	{
		mockMvc=MockMvcBuilders.standaloneSetup(authrestapi).build();
	}
		
	@Test
	@Order(1)
	
	public void findByUsername() throws Exception
	{
		

			
			String username ="Narmadha";
			
			when(userRepository.findByUsername(username)).thenReturn(userdetails);
			
			this.mockMvc.perform(get("/userdetails/{username}",username))
			.andExpect(status().isOk())
			.andExpect(MockMvcResultMatchers.jsonPath(".name").value("Nirmal"))
			.andExpect(MockMvcResultMatchers.jsonPath(".address").value("Chennai"))
			.andExpect(MockMvcResultMatchers.jsonPath(".username").value("Narmadha"))
			.andExpect(MockMvcResultMatchers.jsonPath(".email").value("nrmlbab@gmail.com"))
			.andExpect(MockMvcResultMatchers.jsonPath(".accountnumber").value("123456789"))
			.andExpect(MockMvcResultMatchers.jsonPath(".mobilenumber").value("9884690126"))
			.andDo(print());
			
		}
		
	}
	

