package com.fernando.spring.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fernando.spring.Model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido,	Long>	{
}

