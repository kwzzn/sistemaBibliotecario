package com.example.trabalho.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Representa um autor no sistema.
 */
@AllArgsConstructor
@NoArgsConstructor // Construtores padrão e completo
@Data // Gera automaticamente os métodos getters, setters, equals, hashCode e toString
@Entity
public class Autor {

    /**
     * Identificador único do autor.
     */
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    /**
     * Nome do autor.
     */
    private String nome;

    /**
     * Nacionalidade do autor.
     */
    private String nacionalidade;
}
