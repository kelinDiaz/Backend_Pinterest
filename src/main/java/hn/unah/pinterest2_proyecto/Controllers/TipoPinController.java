package hn.unah.pinterest2_proyecto.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.pinterest2_proyecto.Entities.TipoPin;
import hn.unah.pinterest2_proyecto.Services.Impl.TipoPinImpl;

@RestController
@RequestMapping("/api/tipoPin")
public class TipoPinController {
    
    @Autowired
  private TipoPinImpl tipoPinImpl;


       @PostMapping("/insertar")
       public TipoPin insertar( @RequestBody TipoPin tipoPin) {
        // TODO Auto-generated method stub
        return this.tipoPinImpl.insertar(tipoPin);
    }
    
}
