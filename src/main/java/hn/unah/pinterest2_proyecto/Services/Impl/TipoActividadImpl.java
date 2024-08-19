package hn.unah.pinterest2_proyecto.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.pinterest2_proyecto.Entities.TipoActividad;
import hn.unah.pinterest2_proyecto.Repositories.TipoActRepository;
import hn.unah.pinterest2_proyecto.Services.TipoActividadService;

 @Service
public class TipoActividadImpl  implements TipoActividadService{
  
    @Autowired
    private TipoActRepository tipoActRepository;

    
@Override
public TipoActividad crear(TipoActividad tipoActividad) {
    // TODO Auto-generated method stub
    return this.tipoActRepository.save(tipoActividad);
}


    
}
