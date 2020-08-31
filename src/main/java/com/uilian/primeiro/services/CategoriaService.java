package com.uilian.primeiro.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uilian.primeiro.domain.Categoria;
import com.uilian.primeiro.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	CategoriaRepository repository;
	
	public Categoria find(Integer id) {
		 Optional<Categoria> obj = repository.findById(id);
		return obj.orElse(null);
		} 
	
}
