package hn.unah.pinterest2_proyecto.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.pinterest2_proyecto.Entities.Genero;
import hn.unah.pinterest2_proyecto.Repositories.GeneroRepository;
import hn.unah.pinterest2_proyecto.Services.GeneroService;

@Service
public class GeneroImpl implements GeneroService{

    @Autowired
    private GeneroRepository generoRepository;

    @Override
    public Genero insertar(Genero genero) {
        // TODO Auto-generated method stub
        return this.generoRepository.save(genero);
        
    }

    @Override
    public List<Genero> obtener() {
        // TODO Auto-generated method stub
        return (List<Genero>) this.generoRepository.findAll();
    }
    
}
