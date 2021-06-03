package com.Farmacia.Farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Farmacia.Farmacia.model.categoria;

public interface CategoriaRepository extends JpaRepository <categoria, Long>{
	
public List<categoria> findAllByDescricaoCategoriaContainingIgnoreCase (String descricao);


}
