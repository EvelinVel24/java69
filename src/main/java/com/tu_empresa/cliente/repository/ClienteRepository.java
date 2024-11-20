package main.java.com.tu_empresa.cliente.repository;

import com.tu_empresa.cliente.mapper.ClienteMapper;
import com.tu_empresa.cliente.model.Cliente;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteRepository {
    private final ClienteMapper clienteMapper;

    public ClienteRepository(ClienteMapper clienteMapper) {
        this.clienteMapper = clienteMapper;
    }

    public void guardarCliente(Cliente cliente) {
        clienteMapper.insertarCliente(cliente);
    }

    public Cliente buscarClientePorId(int id) {
        return clienteMapper.buscarClientePorId(id);
    }

    public List<Cliente> listarTodosLosClientes() {
        return clienteMapper.listarClientes();
    }
}
