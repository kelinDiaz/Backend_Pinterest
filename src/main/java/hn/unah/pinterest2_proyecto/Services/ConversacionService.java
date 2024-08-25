package hn.unah.pinterest2_proyecto.Services;

import java.util.List;

import hn.unah.pinterest2_proyecto.Entities.Conversacion;

public interface ConversacionService {


    public Conversacion insertar(Conversacion conversacion ,long usuarioEmisor, long usuarioReceptor);

    public List<Conversacion> Obtener(long usuarioEmisor);
    
}
