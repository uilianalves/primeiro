package com.uilian.primeiro.resourse;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uilian.primeiro.domain.Categoria;
import com.uilian.primeiro.repositories.CategoriaRepository;
import com.uilian.primeiro.services.CategoriaService;


@RestController
@RequestMapping(value="/categorias")
public class CategoriaResourse {
	
	@Autowired
	 CategoriaService service;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat = new Categoria(1, "Informatica");
		Categoria cat2 = new Categoria(2,"Escritorio");
		
		List<Categoria> obj = new ArrayList<>();
		
		obj.add(cat);
		obj.add(cat2);
		
		return obj;
				
	}
	
	
}
