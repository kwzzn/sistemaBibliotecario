package com.example.trabalho.repository;

import com.example.trabalho.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório para a entidade Livro.
 * Esta interface estende o JpaRepository, permitindo realizar operações CRUD
 * e outras operações relacionadas à entidade Livro no banco de dados.
 */
public interface LivroRepository extends JpaRepository<Livro, Integer> {
}
