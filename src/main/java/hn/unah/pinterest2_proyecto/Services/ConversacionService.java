package hn.unah.pinterest2_proyecto.Services;

import hn.unah.pinterest2_proyecto.Entities.Conversacion;

public interface ConversacionService {


    public Conversacion insertar(Conversacion conversacion ,long usuarioEmisor, long usuarioReceptor);
    
}
