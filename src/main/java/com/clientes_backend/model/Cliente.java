package com.clientes_backend.model;

import lombok.Data;

@Data
public class Cliente {

    private Integer id;
    private String nombre;
    private String apellido;
    private String correo;
}
