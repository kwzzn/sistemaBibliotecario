package com.example.trabalho.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor // construtores
@Data // get set
@Entity
public class Autor {

    @GeneratedValue  (strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String nome;
    private String nacionalidade;

}
