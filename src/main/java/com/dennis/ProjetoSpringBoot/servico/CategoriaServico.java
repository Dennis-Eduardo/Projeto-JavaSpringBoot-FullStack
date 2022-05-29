package com.dennis.ProjetoSpringBoot.servico;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dennis.ProjetoSpringBoot.domain.Categoria;
import com.dennis.ProjetoSpringBoot.repository.CategoriaRepository;

@Service
public class CategoriaServico {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Optional<Categoria> buscar(Long id) {
		
		Optional<Categoria> obj = categoriaRepository.findById(id);
		
		return obj;
	}

}
