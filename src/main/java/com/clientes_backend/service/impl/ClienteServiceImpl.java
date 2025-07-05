package com.clientes_backend.service.impl;

import com.clientes_backend.mapper.ClienteRepository;
import com.clientes_backend.model.Cliente;
import com.clientes_backend.response.GenericResponse;
import com.clientes_backend.service.ClienteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    private static final Logger log = LoggerFactory.getLogger(ClienteServiceImpl.class);
    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public GenericResponse<List<Cliente>> findAll() {
        log.info("Obteniendo lista de clientes...");
        try {
            List<Cliente> listaClientes = clienteRepository.findAll();
            if (listaClientes.isEmpty()) {
                log.warn("No se encontraron registros de clientes...");
                return new GenericResponse<>(true, "No se encontraron registros", null);
            }
            return new GenericResponse<>(true, listaClientes);
        } catch (Exception e) {
            log.error("Error al intentar obtener la lista de clientes...");
            return new GenericResponse<>(false, "Algo salió mal", null);
        }
    }

    @Override
    public GenericResponse<Cliente> findById(Integer idCliente) {
        log.info("Obteniendo cliente por id...");
        try {
            Cliente cliente = clienteRepository.findById(idCliente);
            if(cliente == null) {
                log.warn("No se encontró cliente con el id: {}", idCliente);
                return new GenericResponse<>(false, "No se encontró cliente con el id: " + idCliente, null);
            }
            log.info("Cliente obtenido correctamente...");
            return new GenericResponse<>(true, cliente);
        } catch (Exception e) {
            log.error("Error al intentar obtener la lista de clientes...");
            return new GenericResponse<>(false, "Algo salió mal", null);
        }
    }
}
