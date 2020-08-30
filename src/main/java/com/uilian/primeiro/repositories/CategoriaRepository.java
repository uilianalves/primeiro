

package com.uilian.primeiro.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uilian.primeiro.domain.Categoria;
import com.uilian.primeiro.services.CategoriaService;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {
	
	@Autowired
	CategoriaService servi = new CategoriaService();
	
}
