package com.howtaste;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;


//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class HowTasteApplication {

	public static void main(String[] args) {
		SpringApplication.run(HowTasteApplication.class, args);
		
	}

}
