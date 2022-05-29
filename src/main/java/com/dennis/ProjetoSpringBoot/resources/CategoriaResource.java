package com.dennis.ProjetoSpringBoot.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dennis.ProjetoSpringBoot.domain.Categoria;
import com.dennis.ProjetoSpringBoot.servico.CategoriaServico;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaServico categoriaServico;

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    public ResponseEntity<Optional<Categoria>> listar(@PathVariable Long id){
    	
    	Optional<Categoria> obj = categoriaServico.buscar(id);
    	
    	return ResponseEntity.ok().body(obj);
    }
    
    
}
