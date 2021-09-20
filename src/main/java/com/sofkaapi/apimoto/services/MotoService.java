package com.sofkaapi.apimoto.services;

import com.sofkaapi.apimoto.entities.Moto;
import com.sofkaapi.apimoto.repositories.MotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MotoService implements InterfaceServicesMoto{

    @Autowired
    private MotoRepository data;
    @Override
    public Moto save(Moto moto) {
        return  data.save(moto);
    }

    @Override
    public List<Moto> list() {
        return null;
    }

    @Override
    public Moto listById(int id) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Moto update(Moto persona) {
        return null;
    }
}
