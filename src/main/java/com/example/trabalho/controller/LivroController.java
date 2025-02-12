package com.example.trabalho.controller;

import com.example.trabalho.models.Livro;
import com.example.trabalho.service.LivroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/livro") 
public class LivroController {

    private LivroService service;

    @PostMapping
    public ResponseEntity<Livro> postLivro(@RequestBody Livro livro) {
        return new ResponseEntity<>(service.createLivro(livro), HttpStatus.OK);
    }

}
