package com.example.trabalho.repository;

import com.example.trabalho.models.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository <Livro, Integer> {
}
