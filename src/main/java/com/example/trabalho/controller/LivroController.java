package com.example.trabalho.controller;

import com.example.trabalho.models.Livro;
import com.example.trabalho.service.LivroService;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livro")
@AllArgsConstructor
public class LivroController {

    private LivroService service;

    @PostMapping
    public ResponseEntity<Livro> postLivro(@RequestBody Livro livro) {
        return new ResponseEntity<>(service.createLivro(livro), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livro> updateLivro(@RequestBody Livro livro, @PathVariable Integer id){
        return new ResponseEntity<>(service.editLivro(livro, id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> getLivro(@PathVariable Integer id){
        return new ResponseEntity<>(service.getLivro(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Livro> deleteLivro(@PathVariable Integer id){
        service.deleteLivro(id);
        return new ResponseEntity<>((HttpStatus.OK));
    }

}
