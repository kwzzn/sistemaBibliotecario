package com.example.trabalho.controller;

import com.example.trabalho.models.Livro;
import com.example.trabalho.service.LivroService;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador para gerenciar operações relacionadas a Livros.
 */
@RestController
@RequestMapping("/livro")
@AllArgsConstructor
public class LivroController {

    private LivroService service;

    /**
     * Cria um novo livro.
     *
     * @param livro Objeto Livro a ser criado.
     * @return ResponseEntity contendo o livro criado e o status da resposta.
     */
    @PostMapping
    public ResponseEntity<Livro> postLivro(@RequestBody Livro livro) {
        return new ResponseEntity<>(service.createLivro(livro), HttpStatus.OK);
    }

    /**
     * Atualiza um livro existente.
     *
     * @param livro Objeto Livro com os novos dados.
     * @param id ID do livro a ser atualizado.
     * @return ResponseEntity contendo o livro atualizado e o status da resposta.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Livro> updateLivro(@RequestBody Livro livro, @PathVariable Integer id){
        return new ResponseEntity<>(service.editLivro(livro, id), HttpStatus.OK);
    }

    /**
     * Obtém um livro pelo ID.
     *
     * @param id ID do livro a ser recuperado.
     * @return ResponseEntity contendo o livro encontrado e o status da resposta.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Livro> getLivro(@PathVariable Integer id){
        return new ResponseEntity<>(service.getLivro(id), HttpStatus.OK);
    }

    /**
     * Exclui um livro pelo ID.
     *
     * @param id ID do livro a ser excluído.
     * @return ResponseEntity com status da operação.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Livro> deleteLivro(@PathVariable Integer id){
        service.deleteLivro(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}