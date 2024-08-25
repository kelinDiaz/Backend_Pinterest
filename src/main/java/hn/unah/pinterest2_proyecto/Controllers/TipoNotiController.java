package hn.unah.pinterest2_proyecto.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.pinterest2_proyecto.Entities.TipoNotificacion;
import hn.unah.pinterest2_proyecto.Services.Impl.TipoNotiImpl;

@RestController
@RequestMapping("/api/tipoNoti")
public class TipoNotiController {

     @Autowired
     private TipoNotiImpl tipoNotiImpl;


     @PostMapping("/insertar")
     public TipoNotificacion insertar(@RequestBody TipoNotificacion tipoNotificacion){
        return this.tipoNotiImpl.insertar(tipoNotificacion);


     }
    
}
