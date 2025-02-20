package com.example.trabalho.service;

import com.example.trabalho.models.Livro;
import com.example.trabalho.repository.LivroRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Serviço que gerencia as operações relacionadas à entidade Livro.
 * Contém métodos para criar, editar, obter e excluir livros no sistema.
 */
@Service
@AllArgsConstructor
public class LivroService {

    private LivroRepository repository;

    /**
     * Cria um novo livro e o salva no banco de dados.
     *
     * @param livro O livro a ser criado.
     * @return O livro que foi salvo no banco de dados.
     */
    public Livro createLivro(Livro livro) {
        return repository.save(livro);
    }

    /**
     * Edita os dados de um livro existente.
     *
     * @param livro O livro com os dados atualizados.
     * @param Id O ID do livro a ser editado.
     * @return O livro editado, salvo no banco de dados.
     */
    public Livro editLivro(Livro livro, Integer Id) {
        livro.setId(Id);
        return repository.save(livro);
    }

    /**
     * Obtém um livro pelo seu ID.
     *
     * @param Id O ID do livro a ser buscado.
     * @return O livro encontrado no banco de dados.
     */
    public Livro getLivro(Integer Id) {
        return repository.getReferenceById(Id);
    }

    /**
     * Exclui um livro do banco de dados pelo seu ID.
     *
     * @param Id O ID do livro a ser excluído.
     */
    public void deleteLivro(Integer Id) {
        repository.deleteById(Id);
    }
}
