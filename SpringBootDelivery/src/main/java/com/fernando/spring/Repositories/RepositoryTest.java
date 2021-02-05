package com.fernando.spring.Repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;

import com.fernando.spring.Model.Cliente;
import com.fernando.spring.Model.Item;
import com.fernando.spring.Model.Pedido;

public class RepositoryTest {

	private static final long ID_CLIENTE_FERNANDO = 11l;
	private static final long ID_CLIENTE_ZE_PEQUENO = 22l;

	private static final long ID_ITEM1 = 100l;
	private static final long ID_ITEM2 = 101l;
	private static final long ID_ITEM3 = 102l;

	private static final long ID_PEDIDO1 = 1000l;
	private static final long ID_PEDIDO2 = 1001l;
	private static final long ID_PEDIDO3 = 1002l;

	public static long getIdClienteFernando() {
		return ID_CLIENTE_FERNANDO;
	}

	public static long getIdClienteZePequeno() {
		return ID_CLIENTE_ZE_PEQUENO;
	}

	public static long getIdItem1() {
		return ID_ITEM1;
	}

	public static long getIdItem2() {
		return ID_ITEM2;
	}

	public static long getIdItem3() {
		return ID_ITEM3;
	}

	public static long getIdPedido1() {
		return ID_PEDIDO1;
	}

	public static long getIdPedido2() {
		return ID_PEDIDO2;
	}

	public static long getIdPedido3() {
		return ID_PEDIDO3;
	}

	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public void run(ApplicationArguments applicationArguments) throws Exception {
		System.out.println(">>>	Iniciando	carga	de	dados...");
		Cliente fernando = new Cliente(ID_CLIENTE_FERNANDO, "Fernando	Boaglio", "Sampa");
		Cliente zePequeno = new Cliente(ID_CLIENTE_ZE_PEQUENO, "Zé	Pequeno", "Cidade	de	Deus");

		Item dog1 = new Item(ID_ITEM1, "Green	Dog	tradicional", 25d);
		Item dog2 = new Item(ID_ITEM2, "Green	Dog	tradicional	picante", 27d);
		Item dog3 = new Item(ID_ITEM3, "Green	Dog	max	salada", 30d);

		List<Item> listaPedidoFernando1 = new ArrayList<Item>();
		listaPedidoFernando1.add(dog1);
		List<Item> listaPedidoZePequeno1 = new ArrayList<Item>();
		listaPedidoZePequeno1.add(dog2);
		listaPedidoZePequeno1.add(dog3);

		Pedido pedidoDoFernando = new Pedido(ID_PEDIDO1, fernando, listaPedidoFernando1, dog1.getPreco());
		fernando.novo

	}
}
