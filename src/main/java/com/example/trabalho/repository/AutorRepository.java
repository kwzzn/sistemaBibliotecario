package com.example.trabalho.repository;

import com.example.trabalho.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório para a entidade Autor.
 * Esta interface estende o JpaRepository, permitindo realizar operações CRUD
 * e outras operações relacionadas à entidade Autor no banco de dados.
 */
public interface AutorRepository extends JpaRepository<Autor, Integer> {
}
