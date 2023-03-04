package com.app.springbootweb.models.entity;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class Usuario {
    @NotEmpty(message = "El id no puede estar vacío")
    private String id;
    @NotEmpty(message = "El usuario no puede estar vacío")
    private String username;
    @Size(min = 3, max = 8, message = "Mínimo 3 caracteres, máximos 8")
    private String password;
    @NotEmpty(message = "El email no puede estar vacío")
    private String email;
    private String fechaNacimiento;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}