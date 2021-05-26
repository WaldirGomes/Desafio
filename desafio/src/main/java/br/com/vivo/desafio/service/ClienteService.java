package br.com.vivo.desafio.service;

import br.com.vivo.desafio.model.Cliente;
import br.com.vivo.desafio.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    public ClienteRepository clienteRepository;

    public Cliente findCliente(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> findAll() {
        return clienteRepository.findAll();
    }

    public void deleteById(Long id) {
        clienteRepository.deleteById(id);
    }

    public Long count() {
       return clienteRepository.count();
    }
}
