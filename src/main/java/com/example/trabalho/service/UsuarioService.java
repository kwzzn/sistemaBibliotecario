package com.example.trabalho.service;

import com.example.trabalho.models.Livro;
import com.example.trabalho.models.Usuario;
import com.example.trabalho.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private UsuarioRepository repository;

    public Usuario createUsuario(Usuario usuario) {
        return repository.save(usuario);
    }

    public Usuario editUsuario(Usuario usuario, Integer Id) {
        usuario.setId(Id);
        return repository.save(usuario);
    }

    public Usuario getUsuario(Integer Id) {
        return repository.getReferenceById(Id);
    }

    public void deleteUsuario(Integer Id) {
        repository.deleteById(Id);
    }
}
