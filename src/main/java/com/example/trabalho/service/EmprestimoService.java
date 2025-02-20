package com.example.trabalho.service;

import com.example.trabalho.models.Emprestimo;
import com.example.trabalho.models.Livro;
import com.example.trabalho.models.Usuario;
import com.example.trabalho.repository.EmprestimoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmprestimoService {

    private EmprestimoRepository repository;

    public Emprestimo createEmprestimo (Emprestimo emprestimo) {
        return repository.save(emprestimo);
    }

    public Emprestimo editEmprestimo (Emprestimo emprestimo, Integer Id) {
        emprestimo.setId(Id);
        return repository.save(emprestimo);
    }

    public Emprestimo getEmprestimo (Integer Id) {
        return repository.findById(Id).get();
    }

    public void deleteEmprestimo (Integer Id) {
        repository.deleteById(Id);
    }
}
