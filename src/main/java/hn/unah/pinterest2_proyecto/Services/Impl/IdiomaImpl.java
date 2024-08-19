package hn.unah.pinterest2_proyecto.Services.Impl;

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
    
}
