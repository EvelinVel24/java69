package main.java.com.tu_empresa.cliente.service;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {
    private final ClienteMapper clienteMapper;

    public ClienteService(ClienteMapper clienteMapper) {
        this.clienteMapper = clienteMapper;
    }

    public void agregarCliente(Cliente cliente) {
        clienteMapper.insertarCliente(cliente);
    }

    public Cliente obtenerClientePorId(int id) {
        return clienteMapper.buscarClientePorId(id);
    }

    public List<Cliente> obtenerTodosLosClientes() {
        return clienteMapper.listarClientes();
    }
}
