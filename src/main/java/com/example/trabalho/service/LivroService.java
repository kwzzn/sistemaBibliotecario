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

    public Livro editLivro(Livro livro, Integer Id) {
        livro.setId(Id);
        return repository.save(livro);
    }

    public Livro getLivro(Integer Id) {
        return repository.getReferenceById(Id);
    }

    public void deleteLivro(Integer Id) {
        repository.deleteById(Id);
    }


}
