package com.example.trabalho.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor // construtores
@Data // get set
@Entity
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String genero;
    private String autor;
    private int anoPublicacao;

    @OneToOne(mappedBy = "livro")
    private Emprestimo emprestimo;

}
