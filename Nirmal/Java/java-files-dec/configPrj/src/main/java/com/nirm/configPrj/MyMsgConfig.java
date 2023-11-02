package com.nirm.configPrj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyMsgConfig {

	@Bean
	public MyMessage myMessage() {
		return new MyMessage();
		
	}
}
