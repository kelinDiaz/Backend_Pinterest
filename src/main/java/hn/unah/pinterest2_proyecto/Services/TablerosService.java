package hn.unah.pinterest2_proyecto.Services;

import java.util.List;

import hn.unah.pinterest2_proyecto.Entities.Tablero;

public interface TablerosService {

    public Tablero insertar(Tablero tablero);



    public List<Tablero> obtenerTablerosPorUsuario(Long codigoUsuario);
    
}
