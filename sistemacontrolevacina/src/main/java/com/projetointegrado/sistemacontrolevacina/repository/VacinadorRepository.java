package com.projetointegrado.sistemacontrolevacina.repository;

import com.projetointegrado.sistemacontrolevacina.entidades.Vacinador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacinadorRepository extends JpaRepository<Vacinador, Long> {
}
