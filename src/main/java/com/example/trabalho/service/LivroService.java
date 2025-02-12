package com.example.trabalho.service;

import com.example.trabalho.models.Livro;
import com.example.trabalho.repository.LivroRepository;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    private LivroRepository repository;

    public Livro createLivro(Livro livro) {
        return repository.save(livro);
    }
}
