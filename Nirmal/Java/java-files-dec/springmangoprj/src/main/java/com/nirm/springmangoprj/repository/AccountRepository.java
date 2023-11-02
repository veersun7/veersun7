package com.nirm.springmangoprj.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nirm.springmangoprj.entity.Account;

public interface AccountRepository extends MongoRepository<Account, String> {

public Account findByName(String name);
public List<Account> findByActType(String actType);
 
 
	
}