package com.EngenhariaSoftwareII.gerenciador_financeiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.EngenhariaSoftwareII.gerenciador_financeiro.model.Categoria;
import com.EngenhariaSoftwareII.gerenciador_financeiro.service.CategoriaService;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public String listarCategorias(Model model) {
        model.addAttribute("categorias", categoriaService.listarCategorias());
        return "categorias";
    }

    @GetMapping("/adicionar")
    public String showAdicionarCategoriaForm(Model model) {
        model.addAttribute("categoria", new Categoria());
        return "adicionarCategoria";
    }

    @PostMapping("/adicionar")
    public String adicionarCategoria(Categoria categoria) {
        categoriaService.adicionarCategoria(categoria);
        return "redirect:/categorias";
    }
}
