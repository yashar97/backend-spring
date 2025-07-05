package com.clientes_backend.dto;

import java.math.BigDecimal;

public class ProductoDTO {

    private Integer id;
    private String nombre;
    private Integer categoria;
    private Integer stock;
    private BigDecimal precio;
    private String precioFormateado;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public String getPrecioFormateado() {
        return precioFormateado;
    }

    public void setPrecioFormateado(String precioFormateado) {
        this.precioFormateado = precioFormateado;
    }
}
