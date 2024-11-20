package com.tu_empresa.cliente.mapper;

import org.apache.ibatis.annotations.*;

public interface ClienteMapper {
    @Insert("INSERT INTO cliente (id_cliente, primer_nombre, segundo_nombre, apell_paterno, apell_materno, direccion) " +
            "VALUES (#{idCliente}, #{primerNombre}, #{segundoNombre}, #{apellPaterno}, #{apellMaterno}, #{direccion})")
    void insertarCliente(Cliente cliente);

    @Select("SELECT * FROM cliente WHERE id_cliente = #{id}")
    Cliente buscarClientePorId(int id);

    @Select("SELECT * FROM cliente")
    List<Cliente> listarClientes();
}
