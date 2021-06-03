package com.Farmacia.Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Farmacia.Farmacia.model.produto;

public interface ProdutoRepository extends JpaRepository <produto, Long>{
	
public List<produto> findAllByNomeProdutoContainingIgnoreCase (String nome);
}


