package com.example.trabalho.repository;

import com.example.trabalho.models.Emprestimo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repositório para a entidade Emprestimo.
 * Esta interface estende o JpaRepository, permitindo realizar operações CRUD
 * e outras operações relacionadas à entidade Emprestimo no banco de dados.
 */
public interface EmprestimoRepository extends JpaRepository<Emprestimo, Integer> {
}
