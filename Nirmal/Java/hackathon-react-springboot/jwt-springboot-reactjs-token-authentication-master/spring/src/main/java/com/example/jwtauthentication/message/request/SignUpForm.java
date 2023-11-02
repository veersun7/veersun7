package com.example.jwtauthentication.message.request;

import java.util.Set;

import javax.validation.constraints.*;

public class SignUpForm {
    @NotBlank
    @Size(min = 3, max = 50)
    private String name;
    
    @NotBlank
    @Size(min = 3, max = 200)
    private String address;

    @NotBlank
    @Size(min = 3, max = 50)
    private String username;

    @NotBlank
    @Size(max = 60)
    @Email
    private String email;
    
    @NotBlank
    @Size(min = 10, max = 10)
    private String accountnumber;
    
    @NotBlank
    @Size(min = 10, max = 10)
    private String mobilenumber;
    
    
    private Set<String> role;
    
    @NotBlank
    @Size(min = 6, max = 40)
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        
        
    }
    
    public String getAccountnumber() {
        return accountnumber;
    }
    
    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
        
    }
    
    public String getMobilenumber() {
        return mobilenumber;
    }
    
    public void setMobilenumber(String mobilenumber) {
        this.mobilenumber = mobilenumber;
        
    }    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public Set<String> getRole() {
    	return this.role;
    }
    
    public void setRole(Set<String> role) {
    	this.role = role;
    }
}