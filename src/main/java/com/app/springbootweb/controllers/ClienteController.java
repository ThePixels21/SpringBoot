package com.app.springbootweb.controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.springbootweb.models.Cliente;
import com.app.springbootweb.models.Vendedor;

@Controller
@RequestMapping("/cliente")
public class ClienteController {
    @GetMapping({ "/", "" })
    public String indexCliente(Model model) {
        Cliente cliente = new Cliente();
        model.addAttribute("titulo", "Perfil");
        model.addAttribute("cliente", cliente);
        cliente.setNombre("Alvaro");
        cliente.setApellido("Rodriguez");
        cliente.setEmail("alvaro.rodriguez@eam.edu.co");
        model.addAttribute("titulo", "Perfil del cliente ".concat(cliente.getNombre()));
        return "cliente/index";
    }

    @ModelAttribute("vendedores")
    public List<Vendedor> poblarVendedores() {
        List<Vendedor> vendedores = Arrays.asList(new Vendedor("Pepito", "Perez", "pepito@prueba.com"),
                new Vendedor("Cosme", "Fulano", "cosme@prueba.com"));
        return vendedores;
    }

}
