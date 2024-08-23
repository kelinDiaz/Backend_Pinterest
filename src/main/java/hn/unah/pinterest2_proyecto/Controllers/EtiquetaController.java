package hn.unah.pinterest2_proyecto.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.pinterest2_proyecto.Entities.Etiqueta;
import hn.unah.pinterest2_proyecto.Services.Impl.EtiquetaImpl;

@RestController
@RequestMapping("/api/etiquetas")
public class EtiquetaController {
  
    @Autowired
    private EtiquetaImpl etiquetaImpl;

    @PostMapping("/insertar")
    public Etiqueta crearEtiqueta( @RequestBody Etiqueta etiqueta) {
        // TODO Auto-generated method stub
        return this.etiquetaImpl.crearEtiqueta(etiqueta);
    }
    
}
