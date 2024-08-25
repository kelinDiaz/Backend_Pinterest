package hn.unah.pinterest2_proyecto.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.pinterest2_proyecto.Entities.TipoNotificacion;
import hn.unah.pinterest2_proyecto.Repositories.TipoNotiRepository;
import hn.unah.pinterest2_proyecto.Services.TipoNotiService;

@Service
public class TipoNotiImpl implements TipoNotiService {

    @Autowired
    private TipoNotiRepository tipoNotiRepository;
    

    @Override
    public TipoNotificacion insertar(TipoNotificacion tipoNotificacion) {
        // TODO Auto-generated method stub
        return this.tipoNotiRepository.save(tipoNotificacion);
    }
}
