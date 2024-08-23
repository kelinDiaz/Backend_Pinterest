package hn.unah.pinterest2_proyecto.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.pinterest2_proyecto.Entities.Mensaje;
import hn.unah.pinterest2_proyecto.Services.Impl.MensajeImpl;

@RestController
@RequestMapping("/api/mensajes")
public class MensajeController {

    @Autowired
    private MensajeImpl mensajeImpl;

     @PostMapping("/insertar")
    public Mensaje crearMensaje(@RequestBody Mensaje mensaje, @RequestParam long codigoCvs, @RequestParam long codigoEstadoMsj, @RequestParam  (required = false)long codigoReaccion){
        return this.mensajeImpl.crearMensaje(mensaje, codigoCvs, codigoEstadoMsj, codigoReaccion);


    }
    
}
