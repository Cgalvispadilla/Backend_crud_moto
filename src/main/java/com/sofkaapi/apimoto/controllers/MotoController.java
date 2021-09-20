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

    @PostMapping(value = "/agregar")
    @ResponseStatus(HttpStatus.CREATED)
    public Moto addMoto(@RequestBody Moto moto) {
        return services.save(moto);
    }


}
