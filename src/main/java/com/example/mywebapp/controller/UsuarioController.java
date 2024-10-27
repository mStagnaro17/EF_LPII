package com.example.mywebapp.controller;

import com.example.mywebapp.model.Usuario;
import com.example.mywebapp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuService;

    @GetMapping
    public String listarUsuarios(Model model) {
        List<Usuario> usuarios = usuService.listarUsuarios();
        model.addAttribute("usuarios", usuarios);
        model.addAttribute("usuario", new Usuario()); // Asegúrate de que esto esté presente
        return "usuarios"; // Verifica que esta vista existe
    }

    @PostMapping
    public String guardarUsuarios(@ModelAttribute Usuario usuario) {
        usuService.guardarUsuario(usuario);
        return "redirect:/usuarios"; // Esto debería estar correcto
    }
}
