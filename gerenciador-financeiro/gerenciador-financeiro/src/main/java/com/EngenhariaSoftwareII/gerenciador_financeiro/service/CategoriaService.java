package com.EngenhariaSoftwareII.gerenciador_financeiro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.EngenhariaSoftwareII.gerenciador_financeiro.model.Categoria;
import com.EngenhariaSoftwareII.gerenciador_financeiro.repository.CategoriaRepository;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria adicionarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    public List<Categoria> listarCategorias() {
        return categoriaRepository.findAll();
    }
}
