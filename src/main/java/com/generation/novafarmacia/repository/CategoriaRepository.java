package com.generation.novafarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.novafarmacia.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

	   public List<Categoria> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);
	   
}