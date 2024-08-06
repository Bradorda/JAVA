package com.EngenhariaSoftwareII.gerenciador_financeiro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EngenhariaSoftwareII.gerenciador_financeiro.dto.UsuarioDTO;
import com.EngenhariaSoftwareII.gerenciador_financeiro.model.Usuario;
import com.EngenhariaSoftwareII.gerenciador_financeiro.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario cadastrarUsuario(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setNome(usuarioDTO.getNome());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setSenha(usuarioDTO.getSenha());
        return usuarioRepository.save(usuario);
    }
}