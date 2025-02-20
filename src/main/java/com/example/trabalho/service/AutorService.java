package com.example.trabalho.service;

import com.example.trabalho.models.Autor;
import com.example.trabalho.repository.AutorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Serviço que gerencia as operações relacionadas à entidade Autor.
 * Contém métodos para criar, editar, obter e excluir autores no sistema.
 */
@Service
@AllArgsConstructor
public class AutorService {

    private AutorRepository repository;

    /**
     * Cria um novo autor e o salva no banco de dados.
     *
     * @param autor O autor a ser criado.
     * @return O autor que foi salvo no banco de dados.
     */
    public Autor createAutor(Autor autor) {
        return repository.save(autor);
    }

    /**
     * Edita os dados de um autor existente.
     *
     * @param autor O autor com os dados atualizados.
     * @param Id O ID do autor a ser editado.
     * @return O autor editado, salvo no banco de dados.
     */
    public Autor editAutor(Autor autor, Integer Id) {
        autor.setId(Id);
        return repository.save(autor);
    }

    /**
     * Obtém um autor pelo seu ID.
     *
     * @param Id O ID do autor a ser buscado.
     * @return O autor encontrado no banco de dados.
     */
    public Autor getAutor(Integer Id) {
        return repository.getReferenceById(Id);
    }

    /**
     * Exclui um autor do banco de dados pelo seu ID.
     *
     * @param Id O ID do autor a ser excluído.
     */
    public void deleteAutor(Integer Id) {
        repository.deleteById(Id);
    }
}
