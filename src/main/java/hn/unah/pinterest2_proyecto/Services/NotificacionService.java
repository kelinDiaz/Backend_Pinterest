package hn.unah.pinterest2_proyecto.Services;

import hn.unah.pinterest2_proyecto.Entities.Notificacion;

public interface NotificacionService {


    public Notificacion insertar (Notificacion notificacion , long usuarioEmisor , long UsuarioReceptor, long codigoPin);

    
}
