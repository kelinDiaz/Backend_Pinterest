package hn.unah.pinterest2_proyecto.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.pinterest2_proyecto.Entities.Etiqueta;
import hn.unah.pinterest2_proyecto.Repositories.EtiquetaRepository;
import hn.unah.pinterest2_proyecto.Services.EtiquetaService;

@Service
public class EtiquetaImpl implements EtiquetaService {

    @Autowired
    private EtiquetaRepository etiquetaRepository;
    

    @Override
    public Etiqueta crearEtiqueta(Etiqueta etiqueta) {
        // TODO Auto-generated method stub
        return this.etiquetaRepository.save(etiqueta);
    }
}
