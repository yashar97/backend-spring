package com.clientes_backend.service;


import com.clientes_backend.model.Producto;
import com.clientes_backend.response.GenericResponse;
import java.util.List;

public interface ProductoService {

    GenericResponse<List<Producto>> findAll();
}
