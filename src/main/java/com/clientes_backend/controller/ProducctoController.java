package com.clientes_backend.controller;

import com.clientes_backend.dto.ProductoDTO;
import com.clientes_backend.model.Producto;
import com.clientes_backend.response.GenericResponse;
import com.clientes_backend.service.ProductoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/producto")
public class ProducctoController {

    private final ProductoService productoService;

    public ProducctoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public GenericResponse<List<Producto>> findAll() {
        return productoService.findAll();
    }
}
