package com.unac.projecsJava.services;

import com.unac.projecsJava.entidades.Cliente;

import java.util.List;

public interface IclienteServices {
    public List<Cliente> getList ();
    public Cliente save(Cliente cliente);
    public  Cliente findById(Long id);
    public  void delete(Long id);


}
