package com.example.trabalho.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor // construtores
@Data // get set
@Entity
public class Emprestimo {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    @OneToOne
    private Livro livro;
    @OneToOne
    private Usuario usuario;

}
