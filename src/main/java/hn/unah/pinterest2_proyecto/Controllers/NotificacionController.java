package hn.unah.pinterest2_proyecto.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.pinterest2_proyecto.Entities.Notificacion;
import hn.unah.pinterest2_proyecto.Services.Impl.NotificacionImpl;

@RestController
@RequestMapping("/api/notificaciones")
public class NotificacionController {
    


    @Autowired
    private NotificacionImpl notificacionImpl;


    @PostMapping("/insertar/{usuarioEmisor}/{usuarioReceptor}/{codigoPin}")
    public Notificacion insertar(@RequestBody Notificacion notificacion, @PathVariable long usuarioEmisor, @PathVariable long usuarioReceptor, @PathVariable long codigoPin){

        return this.notificacionImpl.insertar(notificacion, usuarioEmisor, usuarioReceptor, codigoPin);

  }



}
