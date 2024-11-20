package main.java.com.tu_empresa.cliente.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @PostMapping
    public void agregarCliente(@RequestBody Cliente cliente) {
        clienteService.agregarCliente(cliente);
    }

    @GetMapping("/{id}")
    public Cliente obtenerCliente(@PathVariable int id) {
        return clienteService.obtenerClientePorId(id);
    }

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.obtenerTodosLosClientes();
    }
}

