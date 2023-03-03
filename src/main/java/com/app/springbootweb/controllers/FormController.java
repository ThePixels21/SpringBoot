package com.app.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.app.springbootweb.models.entity.Usuario;

import jakarta.validation.Valid;

@Controller
@SessionAttributes("usuario")
public class FormController {

    @GetMapping("/form")
    public String form(Model model){
        Usuario usuario = new Usuario();
        usuario.setId("123456");
        model.addAttribute("titulo", "formulario");
        model.addAttribute("usuario", usuario);
        return "form";
    }

    @PostMapping("/form")
    public String procesar(@Valid Usuario usuario, BindingResult result, Model model){
        if(result.hasErrors()){
            model.addAttribute("titulo", "Resultado formulario");
        }
        return "resultado";
    }
}