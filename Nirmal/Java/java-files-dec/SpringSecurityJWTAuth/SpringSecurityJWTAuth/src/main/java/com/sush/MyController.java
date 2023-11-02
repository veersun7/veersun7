package com.sush;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	private AuthenticationManager authenticationManager ;
	
	@Autowired
	private JwtUtility jwtUtil;
	
	@Autowired
	private MyUserDetailsService myUserDetailsService  ;
	
	@GetMapping("/hello")
	public String myPage() {
		return "Hello  everyone  : welcome to the world of JWT";
	}
	
	@RequestMapping(value="/authenticate", method=RequestMethod.POST)
	public ResponseEntity<?> authenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception { 
		
		try {
		authenticationManager.authenticate(
				new  UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(),authenticationRequest.getPassword())
				);
		} catch ( BadCredentialsException e)
		{
			throw new Exception("Invalid username or password",e) ;
		}
		final UserDetails userDetails = myUserDetailsService
				.loadUserByUsername(authenticationRequest.getUsername()); 
		
		final String jwt = jwtUtil.generateToken(userDetails);
		
		return ResponseEntity.ok(new AuthenticationResponse(jwt)) ;
	}
}