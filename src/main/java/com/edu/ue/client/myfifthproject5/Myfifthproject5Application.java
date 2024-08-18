package com.edu.ue.client.myfifthproject5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
//Eric Santiago Perez BOnilla
@SpringBootApplication
public class Myfifthproject5Application {

	public static void main(String[] args) {
		SpringApplication.run(Myfifthproject5Application.class, args);
	}
@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
	
}
