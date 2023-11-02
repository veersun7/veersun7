package com.example.demo.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import java.util.Optional;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.demo.exception.UserAlreadyExistException;
import com.example.demo.model.Users;
import com.example.demo.repository.UsersRepository;
@ExtendWith(MockitoExtension.class)
class UsersServiceTest {

	@Mock
    private UsersRepository URepo;
	
	@InjectMocks
    private UsersServiceImpl  userService;
    private Users Users,Users1;
    private List<Users> UserList;
    
    @BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);

        Users = new Users("dilli@gmail.com","DilliGanesh",(long) 1234567890,(long) 1234567890,"Rivi123*" );
        Users1 = new Users("dilli@gmail.com","DilliGanesh",(long) 1234567890,(long) 1234567890,"Rivi123*" );
        Optional.of(Users);
	}

	@AfterEach
	void tearDown() throws Exception {
		Users = null;
	}

	@Test
	void testRegisterUser() throws UserAlreadyExistException {
		 when(URepo.save(any())).thenReturn(Users);
	        assertEquals(Users, userService.registerUser(Users));
	        verify(URepo, times(1)).save(any());
	}



	@Test
	void testGetAllUser() {
		URepo.save(Users);

        when(URepo.findAll()).thenReturn(UserList);
        List<Users> UserList1 = userService.getAllUser();
        assertEquals(UserList, UserList1);
        verify(URepo, times(1)).save(Users);
        verify(URepo, times(1)).findAll();
	}


}
