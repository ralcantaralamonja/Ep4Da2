package com.tickets.sales.Model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idusuario")
    private Integer id;

    @NotBlank
    private String nombres;
    @NotBlank
    private String apellidos;
    @Column(name = "nom_completo")
    private String nombreCompleto;

    @NotEmpty
    @Email
    private String email;

    private String password;

    @NotBlank
    @Transient
    private String password1;

    @NotBlank
    @Transient
    private String password2;

    public enum Rol{
        ADMIN,
        CLIENTE
    }

    private Rol rol;

    @PrePersist // se ejecuta automaticamente antes de insertar un nuevo usuario
    @PreUpdate // se ejecuta automaticamente antes de actualizar un usuario
    void asignarNombreCompleto(){
        nombreCompleto = nombres + " " + apellidos;
    }

}
