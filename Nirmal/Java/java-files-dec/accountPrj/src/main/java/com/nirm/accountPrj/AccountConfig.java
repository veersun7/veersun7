package com.nirm.accountPrj;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AccountConfig {

	@Bean
	public CreditCard cCard () {
		return new CreditCard();
	}
	
	@Bean
	public DebitCard dCard () {
		return new DebitCard();
	}
	
	
}
