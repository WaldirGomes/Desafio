package br.com.vivo.desafio.webservice;

import br.com.vivo.desafio.model.Cliente;
import br.com.vivo.desafio.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping(value = "/{id}")
    public Cliente findById(@PathVariable("id") Long id) {
        return clienteService.findCliente(id);
    }

    @PostMapping(path = "/novo", consumes = "application/json", produces = "application/json")
    public Cliente save(@RequestBody Cliente cliente) {
        return clienteService.save(cliente);
    }

    @GetMapping(value = "/all")
    public List<Cliente> findById() {
        return clienteService.findAll();
    }

    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        clienteService.deleteById(id);
    }

    @GetMapping(value = "/total")
    public Long count() {
        return clienteService.count();
    }
}