package com.EngenhariaSoftwareII.gerenciador_financeiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.EngenhariaSoftwareII.gerenciador_financeiro.dto.UsuarioDTO;
import com.EngenhariaSoftwareII.gerenciador_financeiro.service.UsuarioService;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/cadastro")
    public String cadastroForm(org.springframework.ui.Model model) {
        model.addAttribute("usuarioDTO", new UsuarioDTO());
        return "cadastro";
    }

    @PostMapping("/cadastro")
    public String cadastroSubmit(@ModelAttribute @Validated UsuarioDTO usuarioDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "cadastro";
        }
        usuarioService.cadastrarUsuario(usuarioDTO);
        return "redirect:/login";
    }
}
