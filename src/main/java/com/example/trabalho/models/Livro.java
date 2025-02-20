package com.example.trabalho.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Classe que representa um livro.
 * Esta classe mapeia uma entidade Livro que possui atributos como nome, gênero, autor e ano de publicação.
 */
@AllArgsConstructor
@NoArgsConstructor // Construtores automáticos fornecidos pelo Lombok
@Data // Getters e Setters automáticos fornecidos pelo Lombok
@Entity
public class Livro {

    /**
     * Identificador único do livro.
     * Este campo é gerado automaticamente pelo banco de dados.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Nome do livro.
     * Representa o título do livro.
     */
    private String nome;

    /**
     * Gênero do livro.
     * Representa o gênero literário do livro (ex.: ficção, romance, etc.).
     */
    private String genero;

    /**
     * Autor do livro.
     * Representa o nome do autor que escreveu o livro.
     */
    private String autor;

    /**
     * Ano de publicação do livro.
     * Representa o ano em que o livro foi publicado.
     */
    private int anoPublicacao;

    /**
     * Empréstimo associado ao livro.
     * Estabelece um relacionamento de um para um com a entidade Emprestimo.
     * O atributo "mappedBy" indica que a associação é gerenciada pela classe Emprestimo.
     */
    @OneToOne(mappedBy = "livro")
    private Emprestimo emprestimo;
}
