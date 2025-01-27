package com.generation.novafarmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.novafarmacia.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	List<Produto> findAllByNomeContainingIgnoreCase(String Nome); 


}