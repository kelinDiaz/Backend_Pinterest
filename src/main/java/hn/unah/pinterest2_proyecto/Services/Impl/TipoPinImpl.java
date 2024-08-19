package hn.unah.pinterest2_proyecto.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.pinterest2_proyecto.Entities.TipoPin;
import hn.unah.pinterest2_proyecto.Repositories.TipoPinRepository;
import hn.unah.pinterest2_proyecto.Services.TipoPinService;

@Service
public class TipoPinImpl implements TipoPinService{
    
    @Autowired
    private TipoPinRepository tipoPinRepository;


    @Override
    public TipoPin insertar(TipoPin tipoPin) {
        // TODO Auto-generated method stub
        return this.tipoPinRepository.save(tipoPin);
    }
    
}
