package hn.unah.pinterest2_proyecto.Services.Impl;

import java.util.List;

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

    @Override
    public List<Lugar> obtener() {
        // TODO Auto-generated method stub
        return (List<Lugar>)this.lugarRepository.findAll();
    }
    
}
