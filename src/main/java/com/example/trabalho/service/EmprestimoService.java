package com.example.trabalho.service;

import com.example.trabalho.models.Emprestimo;
import com.example.trabalho.repository.EmprestimoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Serviço que gerencia as operações relacionadas à entidade Emprestimo.
 * Contém métodos para criar, editar, obter e excluir empréstimos no sistema.
 */
@Service
@AllArgsConstructor
public class EmprestimoService {

    private EmprestimoRepository repository;

    /**
     * Cria um novo empréstimo e o salva no banco de dados.
     *
     * @param emprestimo O empréstimo a ser criado.
     * @return O empréstimo que foi salvo no banco de dados.
     */
    public Emprestimo createEmprestimo(Emprestimo emprestimo) {
        return repository.save(emprestimo);
    }

    /**
     * Edita os dados de um empréstimo existente.
     *
     * @param emprestimo O empréstimo com os dados atualizados.
     * @param Id O ID do empréstimo a ser editado.
     * @return O empréstimo editado, salvo no banco de dados.
     */
    public Emprestimo editEmprestimo(Emprestimo emprestimo, Integer Id) {
        emprestimo.setId(Id);
        return repository.save(emprestimo);
    }

    /**
     * Obtém um empréstimo pelo seu ID.
     *
     * @param Id O ID do empréstimo a ser buscado.
     * @return O empréstimo encontrado no banco de dados.
     */
    public Emprestimo getEmprestimo(Integer Id) {
        return repository.findById(Id).get();
    }

    /**
     * Exclui um empréstimo do banco de dados pelo seu ID.
     *
     * @param Id O ID do empréstimo a ser excluído.
     */
    public void deleteEmprestimo(Integer Id) {
        repository.deleteById(Id);
    }
}
