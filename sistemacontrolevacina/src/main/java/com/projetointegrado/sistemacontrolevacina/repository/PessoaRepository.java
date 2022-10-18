package com.projetointegrado.sistemacontrolevacina.repository;

import com.projetointegrado.sistemacontrolevacina.entidades.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
