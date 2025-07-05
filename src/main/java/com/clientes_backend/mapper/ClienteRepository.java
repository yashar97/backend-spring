package com.clientes_backend.mapper;

import com.clientes_backend.model.Cliente;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ClienteRepository {

    List<Cliente> findAll();
    Cliente findById(@Param("idCliente") Integer idCliente);
}
