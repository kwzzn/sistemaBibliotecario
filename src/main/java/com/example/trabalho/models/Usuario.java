package com.example.trabalho.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Classe que representa um usuário do sistema.
 * Esta classe mapeia uma entidade de usuário, com atributos como nome, email e senha,
 * e seu relacionamento com a classe Emprestimo.
 */
@AllArgsConstructor
@NoArgsConstructor // Construtores automáticos fornecidos pelo Lombok
@Data // Getters e Setters automáticos fornecidos pelo Lombok
@Entity
public class Usuario {

    /**
     * Identificador único do usuário.
     * Este campo é gerado automaticamente pelo banco de dados.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Nome do usuário.
     * Representa o nome completo do usuário do sistema.
     */
    private String nome;

    /**
     * Email do usuário.
     * Representa o endereço de e-mail do usuário.
     */
    private String email;

    /**
     * Senha do usuário.
     * Representa a senha de autenticação do usuário no sistema.
     */
    private String senha;

    /**
     * Empréstimo associado ao usuário.
     * Estabelece um relacionamento de um para um com a entidade Emprestimo.
     * O atributo "mappedBy" indica que a associação é gerenciada pela classe Emprestimo.
     */
    @OneToOne(mappedBy = "usuario")
    private Emprestimo emprestimo;
}
