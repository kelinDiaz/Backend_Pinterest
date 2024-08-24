package hn.unah.pinterest2_proyecto.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.pinterest2_proyecto.Entities.Idioma;
import hn.unah.pinterest2_proyecto.Repositories.IdiomaRepositoty;
import hn.unah.pinterest2_proyecto.Services.IdiomaService;

@Service
public class IdiomaImpl implements IdiomaService {
    
    @Autowired
    private IdiomaRepositoty idiomaRepositoty;

    @Override
    public Idioma insertar(Idioma idioma) {
        // TODO Auto-generated method stub
        return this.idiomaRepositoty.save(idioma);
    }

    @Override
    public List<Idioma> obtener() {
        // TODO Auto-generated method stub
        return (List<Idioma>) this.idiomaRepositoty.findAll();
    }
    
}
