package com.example.trabalho.controller;

import com.example.trabalho.models.Usuario;
import com.example.trabalho.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador para gerenciar operações relacionadas a Usuários.
 */
@RestController
@RequestMapping("/usuario")
@AllArgsConstructor
public class UsuarioController {

    private UsuarioService service;

    /**
     * Cria um novo usuário.
     *
     * @param usuario Objeto Usuário a ser criado.
     * @return ResponseEntity contendo o usuário criado e o status da resposta.
     */
    @PostMapping
    public ResponseEntity<Usuario> postUsuario(@RequestBody Usuario usuario) {
        return new ResponseEntity<>(service.createUsuario(usuario), HttpStatus.OK);
    }

    /**
     * Atualiza um usuário existente.
     *
     * @param usuario Objeto Usuário com os novos dados.
     * @param id ID do usuário a ser atualizado.
     * @return ResponseEntity contendo o usuário atualizado e o status da resposta.
     */
    @PutMapping("/{id}")
    public ResponseEntity<Usuario> updateUsuario(@RequestBody Usuario usuario,@PathVariable Integer id){
        return new ResponseEntity<>(service.editUsuario(usuario, id), HttpStatus.OK);
    }

    /**
     * Obtém um usuário pelo ID.
     *
     * @param id ID do usuário a ser recuperado.
     * @return ResponseEntity contendo o usuário encontrado e o status da resposta.
     */
    @GetMapping("/{id}")
    public ResponseEntity<Usuario> getUsuario(@PathVariable Integer id){
        return new ResponseEntity<>(service.getUsuario(id), HttpStatus.OK);
    }

    /**
     * Exclui um usuário pelo ID.
     *
     * @param id ID do usuário a ser excluído.
     * @return ResponseEntity com status da operação.
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Usuario> deleteUsuario(@PathVariable Integer id){
        service.deleteUsuario(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
