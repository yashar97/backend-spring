package com.clientes_backend.mapper;

import com.clientes_backend.model.Producto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductoRepository {

    List<Producto> findAll();
}
