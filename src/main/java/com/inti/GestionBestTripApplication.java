package com.inti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
/*
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
*/
@SpringBootApplication
public class GestionBestTripApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestionBestTripApplication.class, args);
	}
	/*
	@Bean // pour pouvoir injecter l'instance de la classe BCryptPasswordEncoder dans le conteneur Spring Context
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder(); 
	}
*/
}
