package com.example.trabalho.service;

import com.example.trabalho.models.Usuario;
import com.example.trabalho.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Serviço que gerencia as operações relacionadas à entidade Usuario.
 * Contém métodos para criar, editar, obter e excluir usuários no sistema.
 */
@Service
@AllArgsConstructor
public class UsuarioService {

    private UsuarioRepository repository;

    /**
     * Cria um novo usuário e o salva no banco de dados.
     *
     * @param usuario O usuário a ser criado.
     * @return O usuário que foi salvo no banco de dados.
     */
    public Usuario createUsuario(Usuario usuario) {
        return repository.save(usuario);
    }

    /**
     * Edita os dados de um usuário existente.
     *
     * @param usuario O usuário com os dados atualizados.
     * @param Id O ID do usuário a ser editado.
     * @return O usuário editado, salvo no banco de dados.
     */
    public Usuario editUsuario(Usuario usuario, Integer Id) {
        usuario.setId(Id);
        return repository.save(usuario);
    }

    /**
     * Obtém um usuário pelo seu ID.
     *
     * @param Id O ID do usuário a ser buscado.
     * @return O usuário encontrado no banco de dados.
     */
    public Usuario getUsuario(Integer Id) {
        return repository.getReferenceById(Id);
    }

    /**
     * Exclui um usuário do banco de dados pelo seu ID.
     *
     * @param Id O ID do usuário a ser excluído.
     */
    public void deleteUsuario(Integer Id) {
        repository.deleteById(Id);
    }
}
