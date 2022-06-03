package com.dennis.ProjetoSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dennis.ProjetoSpringBoot.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {

}
