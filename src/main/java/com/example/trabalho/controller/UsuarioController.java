package com.example.trabalho.controller;

import com.example.trabalho.models.Livro;
import com.example.trabalho.models.Usuario;
import com.example.trabalho.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
@AllArgsConstructor
public class UsuarioController {

    private UsuarioService service;

    @PostMapping
    public ResponseEntity<Usuario> postUsuario(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(service.createUsuario(usuario), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> updateUsuario(@RequestBody Usuario usuario,@PathVariable Integer id){
        return new ResponseEntity<>(service.editUsuario(usuario, id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuario(@PathVariable Integer id){
        return new ResponseEntity<>(service.getUsuario(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> deleteUsuario(@PathVariable Integer id){
        service.deleteUsuario(id);
        return new ResponseEntity<>((HttpStatus.OK));
    }
}
