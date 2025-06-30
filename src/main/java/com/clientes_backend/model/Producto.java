package com.clientes_backend.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Producto {

    private Integer id;
    private String nombre;
    private String categoria;
    private Integer stock;
    private BigDecimal precio;
}
