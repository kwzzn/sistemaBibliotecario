package com.example.trabalho.controller;

import com.example.trabalho.models.Emprestimo;
import com.example.trabalho.service.EmprestimoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador para gerenciar operações relacionadas a Empréstimos.
 */
@RestController
@RequestMapping("/emprestimo")
@AllArgsConstructor
public class EmprestimoController {

    private EmprestimoService service;

    /**
     * Cria um novo empréstimo.
     *
     * @param emprestimo Objeto Empréstimo a ser criado.
     * @return ResponseEntity contendo o empréstimo criado e o status da resposta.
     */
    @PostMapping
    public ResponseEntity<Emprestimo> postEmprestimo(@RequestBody Emprestimo emprestimo) {
        return new ResponseEntity<>(service.createEmprestimo(emprestimo), HttpStatus.OK);
    }

    /**
     * Atualiza um empréstimo existente.
     *
     * @param emprestimo Objeto Empréstimo com os novos dados.
     * @param id ID do empréstimo a ser atualizado.
     * @return ResponseEntity contendo o empréstimo atualizado e o status da resposta.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Emprestimo> updateEmprestimo(@RequestBody Emprestimo emprestimo, @PathVariable Integer id) {
        return new ResponseEntity<>(service.editEmprestimo(emprestimo, id), HttpStatus.OK);
    }

    /**
     * Obtém um empréstimo pelo ID.
     *
     * @param id ID do empréstimo a ser recuperado.
     * @return ResponseEntity contendo o empréstimo encontrado e o status da resposta.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Emprestimo> getEmprestimo(@PathVariable Integer id) {
        return new ResponseEntity<>(service.getEmprestimo(id), HttpStatus.OK);
    }

    /**
     * Exclui um empréstimo pelo ID.
     *
     * @param id ID do empréstimo a ser excluído.
     * @return ResponseEntity com status da operação.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Emprestimo> deleteEmprestimo(@PathVariable Integer id) {
        service.deleteEmprestimo(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
