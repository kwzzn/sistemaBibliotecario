package com.example.trabalho.service;

import com.example.trabalho.models.Autor;
import com.example.trabalho.models.Usuario;
import com.example.trabalho.repository.AutorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AutorService {

    private AutorRepository repository;

    public Autor createAutor(Autor autor) {
        return repository.save(autor);
    }

    public Autor editAutor(Autor autor, Integer Id) {
        autor.setId(Id);
        return repository.save(autor);
    }

    public Autor getAutor(Integer Id) {
        return repository.getReferenceById(Id);
    }

    public void deleteAutor(Integer Id) {
        repository.deleteById(Id);
    }
}
