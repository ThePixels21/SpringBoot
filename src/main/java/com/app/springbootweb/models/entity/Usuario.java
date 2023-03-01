package com.app.springbootweb.models.entity;

import jakarta.validation.constraints.NotEmpty;

public class Usuario {
    @NotEmpty
    private String id;
    @NotEmpty
    private String username;
    @NotEmpty
    private String password;
    @NotEmpty
    private String email;
    @NotEmpty
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