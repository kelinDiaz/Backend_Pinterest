package hn.unah.pinterest2_proyecto.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.pinterest2_proyecto.Entities.Categoria;
import hn.unah.pinterest2_proyecto.Repositories.CategoriaRepository;
import hn.unah.pinterest2_proyecto.Services.CategoriaService;


@Service
public class CategoriaImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    
    @Override
    public Categoria insertar(Categoria categoria) {
        // TODO Auto-generated method stub
        return this.categoriaRepository.save(categoria);
    }
    
}
