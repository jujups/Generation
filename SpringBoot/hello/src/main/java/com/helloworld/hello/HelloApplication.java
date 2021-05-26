package com.helloworld.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloApplication {
	
	@GetMapping ("/Pessego")
	public ResponseEntity<String>segundaFuncao(){
		return ResponseEntity.status(200).body("Persistencia e orientação ao detalhe.");
	}

	@GetMapping ("/Bananinha")
     public ResponseEntity<String>primeiraFuncao(){
		return ResponseEntity.status(200).body("Aprender e compreender o uso do Spring Boot.");
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
		
	}

}
