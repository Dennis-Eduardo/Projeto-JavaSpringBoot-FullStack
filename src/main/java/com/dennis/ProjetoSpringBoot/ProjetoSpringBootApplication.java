package com.dennis.ProjetoSpringBoot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dennis.ProjetoSpringBoot.domain.Categoria;
import com.dennis.ProjetoSpringBoot.domain.Cidade;
import com.dennis.ProjetoSpringBoot.domain.Estado;
import com.dennis.ProjetoSpringBoot.domain.Produto;
import com.dennis.ProjetoSpringBoot.repository.CategoriaRepository;
import com.dennis.ProjetoSpringBoot.repository.CidadeRepository;
import com.dennis.ProjetoSpringBoot.repository.EstadoRepository;
import com.dennis.ProjetoSpringBoot.repository.ProdutoRepository;

@SpringBootApplication
public class ProjetoSpringBootApplication implements CommandLineRunner{
	
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private ProdutoRepository produtoRepository;
	@Autowired
	private CidadeRepository cidadeRepository;
	@Autowired
	private EstadoRepository estadoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringBootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");

		Produto p1 = new Produto(null, "Computador", 2000.00);
		Produto p2 = new Produto(null, "Impressora", 800.00);
		Produto p3 = new Produto(null, "Mouse", 80.00);
		
		Estado est1 = new Estado(null, "Sao Paulo");
		Estado est2 = new Estado(null, "Paraiba");
		
		Cidade c1 = new Cidade(null, "Borborema", est2);
		Cidade c2 = new Cidade(null, "Osasco", est1);
		Cidade c3 = new Cidade(null, "Bananeiras", est2);

		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		est1.getCidades().addAll(Arrays.asList(c1));
		est2.getCidades().addAll(Arrays.asList(c2,c3));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));

		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(c1,c2,c3));
		
	}

}
