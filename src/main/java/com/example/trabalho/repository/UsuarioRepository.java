package com.example.trabalho.repository;

import com.example.trabalho.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório para a entidade Usuario.
 * Esta interface estende o JpaRepository, permitindo realizar operações CRUD
 * e outras operações relacionadas à entidade Usuario no banco de dados.
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
