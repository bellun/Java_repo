package com.fernando.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernando.model.Convidado;



public interface Convidados extends JpaRepository<Convidado, Long> {
	
}