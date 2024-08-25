package hn.unah.pinterest2_proyecto.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.pinterest2_proyecto.Entities.Notificacion;
import hn.unah.pinterest2_proyecto.Entities.Pin;
import hn.unah.pinterest2_proyecto.Entities.TipoNotificacion;
import hn.unah.pinterest2_proyecto.Entities.Usuario;
import hn.unah.pinterest2_proyecto.Repositories.NotificacionRepository;
import hn.unah.pinterest2_proyecto.Repositories.PinRepository;
import hn.unah.pinterest2_proyecto.Repositories.TipoNotiRepository;
import hn.unah.pinterest2_proyecto.Repositories.UsuarioRepository;
import hn.unah.pinterest2_proyecto.Services.NotificacionService;

import java.time.LocalDate;

@Service
public class NotificacionImpl implements NotificacionService {

    @Autowired
    private NotificacionRepository notificacionRepository;
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PinRepository pinRepository;


    @Autowired
    private TipoNotiRepository tipoNotiRepository;



    @Override
    public Notificacion insertar(Notificacion notificacion, long usuarioEmisor, long usuarioReceptor, long codigoPin) {


    
    Usuario emisor = usuarioRepository.findById(usuarioEmisor)
    .orElseThrow(() -> new RuntimeException("Usuario emisor no encontrado"));

    Usuario receptor = usuarioRepository.findById(usuarioReceptor)
    .orElseThrow(() -> new RuntimeException("Usuario receptor no encontrado"));

      Pin pin = pinRepository.findById(codigoPin)
    .orElseThrow(() -> new RuntimeException("Pin no encontrado"));

String nombreTipoNotificacion = notificacion.getTipoNotificacion().getNombreTipoNotificacion();
TipoNotificacion tipoNotificacion = tipoNotiRepository.findByNombreTipoNotificacion(nombreTipoNotificacion);

if (tipoNotificacion == null) {
    tipoNotificacion = new TipoNotificacion();
    tipoNotificacion.setNombreTipoNotificacion(nombreTipoNotificacion);
    tipoNotificacion = tipoNotiRepository.save(tipoNotificacion);
}


Notificacion nuevaNotificacion = new Notificacion();
/*nuevaNotificacion.setFechaCreacion(notificacion.getFechaCreacion());*/
nuevaNotificacion.setFechaCreacion(LocalDate.now()); 
nuevaNotificacion.setUsuarioEmisor(emisor);
nuevaNotificacion.setUsuarioReceptor(receptor);
nuevaNotificacion.setPin(pin);
nuevaNotificacion.setTipoNotificacion(tipoNotificacion);

// Guarda la nueva notificación en el repositorio
return notificacionRepository.save(nuevaNotificacion);
       

}

}
