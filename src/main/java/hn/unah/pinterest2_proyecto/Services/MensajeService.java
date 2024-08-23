package hn.unah.pinterest2_proyecto.Services;

import hn.unah.pinterest2_proyecto.Entities.Mensaje;

public interface MensajeService {

    public Mensaje crearMensaje(Mensaje mensaje, long codigoCvs, long codigoEstadoMsj, Long codigoReaccion);
    
}
