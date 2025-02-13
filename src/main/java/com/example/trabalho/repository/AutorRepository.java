package com.example.trabalho.repository;

import com.example.trabalho.models.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AutorRepository extends JpaRepository <Autor, Integer> {
}
