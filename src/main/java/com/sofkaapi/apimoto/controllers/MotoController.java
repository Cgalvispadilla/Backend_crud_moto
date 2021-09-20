package com.sofkaapi.apimoto.controllers;

import com.sofkaapi.apimoto.entities.Moto;
import com.sofkaapi.apimoto.services.InterfaceServicesMoto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/motos")
public class MotoController {

    @Autowired
    private InterfaceServicesMoto services;

    @GetMapping
    public Iterable<Moto> listAllMotos(){
        return services.list();
    }

    @PostMapping(value = "/agregar")
    @ResponseStatus(HttpStatus.CREATED)
    public Moto addMoto(@RequestBody Moto moto) {
        return services.save(moto);
    }

    @PutMapping
    public Moto update(@RequestBody Moto moto){
        if(moto.getId()!=null){
            return services.save(moto);
        }
        throw new RuntimeException("No existe el id para actualizar");
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id")Integer id){
        services.delete(id);
    }




}
