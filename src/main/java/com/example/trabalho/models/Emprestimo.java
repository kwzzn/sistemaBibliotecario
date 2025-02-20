package com.example.trabalho.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Emprestimo {

    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    
}
