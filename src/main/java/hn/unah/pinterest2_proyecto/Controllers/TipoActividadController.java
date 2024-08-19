package hn.unah.pinterest2_proyecto.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.pinterest2_proyecto.Entities.TipoActividad;
import hn.unah.pinterest2_proyecto.Services.Impl.TipoActividadImpl;

@RestController
@RequestMapping("api/tipoActividad")

public class TipoActividadController {

    @Autowired
    private TipoActividadImpl tipoActividadImpl;


    @PostMapping("/crear")
    public TipoActividad crear( @RequestBody TipoActividad tipoActividad) {
    // TODO Auto-generated method stub
    return this.tipoActividadImpl.crear(tipoActividad);
}
    
}
