package com.example.trabalho.controller;

import com.example.trabalho.models.Autor;
import com.example.trabalho.service.AutorService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador para gerenciar operações relacionadas a Autores.
 */
@RestController
@RequestMapping("/autor")
@AllArgsConstructor
public class AutorController {

    private AutorService service;

    /**
     * Cria um novo autor.
     *
     * @param autor Objeto Autor a ser criado.
     * @return ResponseEntity contendo o autor criado e o status da resposta.
     */
    @PostMapping
    public ResponseEntity<Autor> postAutor(@RequestBody Autor autor) {
        return new ResponseEntity<>(service.createAutor(autor), HttpStatus.OK);
    }

    /**
     * Atualiza um autor existente.
     *
     * @param autor Objeto Autor com os novos dados.
     * @param id ID do autor a ser atualizado.
     * @return ResponseEntity contendo o autor atualizado e o status da resposta.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Autor> updateAutor(@RequestBody Autor autor, @PathVariable Integer id) {
        return new ResponseEntity<>(service.editAutor(autor, id), HttpStatus.OK);
    }

    /**
     * Obtém um autor pelo ID.
     *
     * @param id ID do autor a ser recuperado.
     * @return ResponseEntity contendo o autor encontrado e o status da resposta.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Autor> getAutor(@PathVariable Integer id) {
        return new ResponseEntity<>(service.getAutor(id), HttpStatus.OK);
    }

    /**
     * Exclui um autor pelo ID.
     *
     * @param id ID do autor a ser excluído.
     * @return ResponseEntity com status da operação.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Autor> deleteAutor(@PathVariable Integer id) {
        service.deleteAutor(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}