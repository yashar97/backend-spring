package com.clientes_backend.service;

import com.clientes_backend.model.Cliente;
import com.clientes_backend.response.GenericResponse;

import java.util.List;

public interface ClienteService {

    GenericResponse<List<Cliente>> findAll();
    GenericResponse<Cliente> findById(Integer idCliente);
}
