package com.example.trabalho.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classe que representa um empréstimo de livro.
 * Esta classe mapeia uma relação de empréstimo entre um usuário e um livro.
 */
@AllArgsConstructor
@NoArgsConstructor // Construtores automáticos fornecidos pelo Lombok
@Data // Getters e Setters automáticos fornecidos pelo Lombok
@Entity
public class Emprestimo {

    /**
     * Identificador único do empréstimo.
     * Este campo é gerado automaticamente pelo banco de dados.
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    /**
     * Livro que foi emprestado.
     * Estabelece uma relação de 1 para 1 com a entidade Livro.
     */
    @OneToOne
    private Livro livro;

    /**
     * Usuário que fez o empréstimo.
     * Estabelece uma relação de 1 para 1 com a entidade Usuario.
     */
    @OneToOne
    private Usuario usuario;

}
