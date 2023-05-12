package com.unac.projecsJava.implementacion;

import com.unac.projecsJava.entidades.Cliente;
import com.unac.projecsJava.repositories.ClienteRepository;
import com.unac.projecsJava.services.IclienteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteImplements implements  IclienteServices {
    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> getList() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente save(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente findById(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Long id) {
        clienteRepository.deleteById(id);

    }
}
