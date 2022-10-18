package com.projetointegrado.sistemacontrolevacina.repository;

import com.projetointegrado.sistemacontrolevacina.entidades.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
