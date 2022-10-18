package com.projetointegrado.sistemacontrolevacina.repository;

import com.projetointegrado.sistemacontrolevacina.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
