package com.EngenhariaSoftwareII.gerenciador_financeiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.EngenhariaSoftwareII.gerenciador_financeiro.model.Transacao;
import com.EngenhariaSoftwareII.gerenciador_financeiro.service.CategoriaService;
import com.EngenhariaSoftwareII.gerenciador_financeiro.service.TransacaoService;

@Controller
@RequestMapping("/transacoes")
public class TransacaoController {

    @Autowired
    private TransacaoService transacaoService;

    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public String listarTransacoes(Model model) {
        model.addAttribute("transacoes", transacaoService.listarTransacoes());
        return "transacoes";
    }

    @GetMapping("/adicionar")
    public String showAdicionarTransacaoForm(Model model) {
        model.addAttribute("transacao", new Transacao());
        model.addAttribute("categorias", categoriaService.listarCategorias());
        return "adicionarTransacao";
    }

    @PostMapping("/adicionar")
    public String adicionarTransacao(Transacao transacao) {
        transacaoService.adicionarTransacao(transacao);
        return "redirect:/transacoes";
    }
}
