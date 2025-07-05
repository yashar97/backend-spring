package com.clientes_backend.service.impl;

import com.clientes_backend.mapper.ProductoRepository;
import com.clientes_backend.model.Producto;
import com.clientes_backend.response.GenericResponse;
import com.clientes_backend.service.ProductoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {

    private static final Logger log = LoggerFactory.getLogger(ProductoServiceImpl.class);
    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public GenericResponse<List<Producto>> findAll() {
        log.info("Obteniendo todos los productos...");
        try {
            List<Producto> listaProductos = productoRepository.findAll();
            if(listaProductos.isEmpty()) {
                log.warn("No se encontraron productos");
                return new GenericResponse<>(false, "No se encontraron productos", null);
            }
            log.info("Productos obtenidos correctamente.");
            return new GenericResponse<>(true, listaProductos);
        } catch (Exception e) {
            log.error("Error al intentar obtener todos los productos");
            return new GenericResponse<>(false, "Error al intentar obtener todos los productos", null);
        }
    }
}
