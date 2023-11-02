package com.nirm.springmangoprj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nirm.springmangoprj.entity.Account;
import com.nirm.springmangoprj.repository.AccountRepository;

@SpringBootApplication
public class SpringmongoprjApplication implements CommandLineRunner {

	@Autowired
	private AccountRepository accountRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringmongoprjApplication.class, args);
	}
	
	@Override
	public void run (String...args) throws Exception {
		
		Account a1 = new Account ("Kar","Savings",12000);
		a1.setActNo("56552713310");
		accountRepo.save(a1);
		
		Account a2 = new Account ("Lic","Current",4000);
		a2.setActNo("56557115566");
		accountRepo.save(a2);
		
		Account a3 = new Account ("Man","Savings",20000);
		a3.setActNo("56571114523");
		accountRepo.save(a3);
		
		System.out.println("Display all accounts : ");
		
		for (Account act: accountRepo.findAll()) {
			System.out.println(act);
		}
		
		System.out.println("Find By Name");
		System.out.println(accountRepo.findByName("Kanil"));
		
		
		System.out.println("Find By AccountType");
		for(Account ac: accountRepo.findByActType("Current")) {
			System.out.println(ac);
		}
		
	}

}