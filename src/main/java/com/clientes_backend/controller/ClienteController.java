package com.clientes_backend.controller;

import com.clientes_backend.model.Cliente;
import com.clientes_backend.response.GenericResponse;
import com.clientes_backend.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public GenericResponse<List<Cliente>> findAll() {
        return clienteService.findAll();
    }

    @GetMapping("/{id}")
    public GenericResponse<Cliente> findById(@PathVariable Integer id) {
            return clienteService.findById(id);
    }

    @PostMapping
    public GenericResponse<?> createUser(@RequestBody Cliente objCliente) {
        System.out.println(objCliente);
        return new GenericResponse<>();
    }
}
