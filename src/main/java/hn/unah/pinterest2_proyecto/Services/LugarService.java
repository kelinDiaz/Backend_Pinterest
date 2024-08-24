package hn.unah.pinterest2_proyecto.Services;

import java.util.List;

import hn.unah.pinterest2_proyecto.Entities.Lugar;

public interface LugarService {


    public Lugar insertar(Lugar lugar);

    public List<Lugar> obtener();
    
}
