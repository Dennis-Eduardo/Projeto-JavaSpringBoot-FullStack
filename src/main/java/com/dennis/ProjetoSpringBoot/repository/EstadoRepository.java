package com.dennis.ProjetoSpringBoot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dennis.ProjetoSpringBoot.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {

}
