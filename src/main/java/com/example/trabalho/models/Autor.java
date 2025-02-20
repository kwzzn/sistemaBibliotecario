package com.example.trabalho.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Autor {

    @GeneratedValue  (strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String nome;
    private String nacionalidade;

    public Autor(Integer id, String nome, String nacionalidade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public Autor(String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public Autor() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}
