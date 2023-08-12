package com.anshul.expensive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpensiveApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpensiveApplication.class, args);
	}
	
	public String addition(int a, int b) { 
		return String.valueOf(a+b);
	}

}
