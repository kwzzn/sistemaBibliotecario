package com.example.trabalho.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Livro {

    private Integer id;
    @Id
    @GeneratedValue
            (strategy = GenerationType.IDENTITY)
    private String nome;
    private String genero;
    private String autor;
    private int anoPublicacao;

    public Livro(Integer id, String nome, String genero, String autor, int anoPublicacao) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public Livro(String nome, String genero, String autor, int anoPublicacao) {
        this.nome = nome;
        this.genero = genero;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public Livro() {
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
