package com.fernando.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fernando.spring.model.Categoria;
import com.fernando.spring.repositories.CategoriaRepository;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {

		@Autowired
		private CategoriaRepository categoriaRepositorio;
		
		
		@GetMapping
		public List<Categoria> listar(){
			return categoriaRepositorio.findAll();
		}
		
		/*@GetMapping
		public ResponseEntity<?> listar(){
			List<Categoria> categorias = categoriaRepositorio.findAll();
		
			return !categorias.isEmpty()?	ResponseEntity.ok(categorias) : ResponseEntity.notFound().build() ;
		}*/
	
}
