package com.fernando.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fernando.spring.Model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente,Long>	{


}
