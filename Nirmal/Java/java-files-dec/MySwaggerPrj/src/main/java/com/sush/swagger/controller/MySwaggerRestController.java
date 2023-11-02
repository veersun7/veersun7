package com.sush.swagger.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sush.swagger.model.User;

@RequestMapping("/api")
@RestController
public class MySwaggerRestController {

	List<User> userList = new ArrayList<User>();
	{
	userList.add(new User(1,"Akash","ADMIN","akash123@gmail.com"));
	userList.add(new User(2,"Bipin","USER","bipin123@gmail.com"));
	userList.add(new User(3,"Chetan","OPERATOR","chetan@rediffmail.com"));
	userList.add(new User(4,"Divya","USER","div.456@hotmail.com"));
	userList.add(new User(5,"Romila","USER","romila1888@hotmail.com"));
	
	}
	
	@RequestMapping(value="/users",method=RequestMethod.GET,produces="application/json")
	public List<User>  getUsers() {
		return userList;
	}
	
	@RequestMapping(value="/users/{id}",method=RequestMethod.GET,produces="application/json")
	public User  getUserById(@PathVariable(value="id") int id) {
		return 
				userList.stream().filter(x->x.getId() == id )
					    .collect(Collectors.toList()).get(0) ;
	}
	
	@RequestMapping(value="/users/roles/{roles}",method=RequestMethod.GET,produces="application/json")
	public List<User> getUserByRoles(@PathVariable(value="roles") String roles) {
		return 
				 userList.stream().filter( x->x.getRoles()
				.equalsIgnoreCase(roles))
			    .collect(Collectors.toList()) ;
	}
	
	@RequestMapping(value="/users",method=RequestMethod.POST)
	public User addUser(@RequestParam int id,
						@RequestParam String name,
						@RequestParam String roles,
						@RequestParam String emailid)
			 {
		User newUser = new User(id,name,roles,emailid)  ;
		userList.add(newUser);
		return newUser ;
	}
}
