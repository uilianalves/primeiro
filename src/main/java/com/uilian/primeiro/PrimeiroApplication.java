package com.uilian.primeiro;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uilian.primeiro.domain.Categoria;
import com.uilian.primeiro.repositories.CategoriaRepository;

/**
*b development
*/
@SpringBootApplication
public class PrimeiroApplication implements CommandLineRunner {

	@Autowired
	CategoriaRepository repo; 
			
	public static void main(String[] args) {
		SpringApplication.run(PrimeiroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Categoria cat1 = new Categoria(null, "Informatica");
		Categoria cat2 = new Categoria(null, "Escritorio");
		
		repo.saveAll(Arrays.asList(cat1,cat2));
		
	}
	
	

}
