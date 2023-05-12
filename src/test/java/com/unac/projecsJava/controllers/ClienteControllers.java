package com.unac.projecsJava.controllers;

import com.unac.projecsJava.entidades.Cliente;
import com.unac.projecsJava.services.IclienteServices;
import jakarta.persistence.SqlResultSetMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = {"http://localhost:3000"})
@RestController
@RequestMapping("/")
public class ClienteControllers {
    @Autowired
    private IclienteServices  iclienteServices;

    @GetMapping("/cliente")
    public List<Cliente> index(){
            return iclienteServices.getList();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente save(@Validated @RequestBody Cliente cliente, BindingResult result){
        Cliente user = null;
        if(result.hasErrors()){
            return  user;
        }
        user = iclienteServices.save(cliente);
        return user;
    }

    @DeleteMapping("/cliente/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public  void delete(@PathVariable Long id){
        iclienteServices.delete(id);
    }


}
