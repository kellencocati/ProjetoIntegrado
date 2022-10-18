package com.projetointegrado.sistemacontrolevacina.repository;

import com.projetointegrado.sistemacontrolevacina.entidades.Vacina;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VacinaRepository extends JpaRepository<Vacina, Long> {
}
