package com.example.trabalho.repository;

import com.example.trabalho.models.Emprestimo;
import com.example.trabalho.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmprestimoRepository extends JpaRepository<Emprestimo, Integer> {
}
