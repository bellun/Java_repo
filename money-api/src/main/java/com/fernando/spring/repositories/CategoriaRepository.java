package com.fernando.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernando.spring.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long>{

}
