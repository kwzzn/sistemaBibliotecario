package com.example.trabalho.controller;

import com.example.trabalho.models.Emprestimo;
import com.example.trabalho.models.Livro;
import com.example.trabalho.service.EmprestimoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/emprestimo")
@AllArgsConstructor
public class EmprestimoController {

    private EmprestimoService service;

    @PostMapping
    public ResponseEntity<Emprestimo> postEmprestimo(@RequestBody Emprestimo emprestimo) {
        return new ResponseEntity<>(service.createEmprestimo(emprestimo), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Emprestimo> updateEmprestimo(@RequestBody Emprestimo emprestimo, @PathVariable Integer id) {
        return new ResponseEntity<>(service.editEmprestimo(emprestimo, id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Emprestimo> getEmprestimo(@PathVariable Integer id) {
        return new ResponseEntity<>(service.getEmprestimo(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Emprestimo> deleteEmprestimo(@PathVariable Integer id) {
        service.deleteEmprestimo(id);
        return new ResponseEntity<>((HttpStatus.OK));
    }

}
