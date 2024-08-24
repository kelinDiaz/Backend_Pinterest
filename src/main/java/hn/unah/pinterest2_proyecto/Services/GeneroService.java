package hn.unah.pinterest2_proyecto.Services;

import java.util.List;

import hn.unah.pinterest2_proyecto.Entities.Genero;

public interface GeneroService {

    public Genero insertar(Genero genero);
    

    public List<Genero> obtener();
}
