package hn.unah.pinterest2_proyecto.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.pinterest2_proyecto.Entities.Lugar;
import hn.unah.pinterest2_proyecto.Repositories.LugarRepository;
import hn.unah.pinterest2_proyecto.Services.LugarService;

@Service
public class LugarImpl implements LugarService{
 
     @Autowired
    private LugarRepository lugarRepository;

    
    @Override
    public Lugar insertar(Lugar lugar) {
        // TODO Auto-generated method stub
        return this.lugarRepository.save(lugar);
    }

    
}
