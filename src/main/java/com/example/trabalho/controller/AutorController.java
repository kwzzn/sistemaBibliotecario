package com.example.trabalho.controller;

import com.example.trabalho.models.Autor;
import com.example.trabalho.models.Livro;
import com.example.trabalho.service.AutorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/autor")
@AllArgsConstructor
public class AutorController {

    private AutorService service;

    @PostMapping
    public ResponseEntity<Autor> postAutor(@RequestBody Autor autor) {
        return new ResponseEntity<>(service.createAutor(autor), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Autor> updateAutor(@RequestBody Autor autor,@PathVariable Integer id){
        return new ResponseEntity<>(service.editAutor(autor, id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Autor> getAutor(@PathVariable Integer id){
        return new ResponseEntity<>(service.getAutor(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Autor> deleteAutor(@PathVariable Integer id){
        service.deleteAutor(id);
        return new ResponseEntity<>((HttpStatus.OK));
    }
}
