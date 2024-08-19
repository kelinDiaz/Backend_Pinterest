package hn.unah.pinterest2_proyecto.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.pinterest2_proyecto.Entities.Genero;
import hn.unah.pinterest2_proyecto.Services.Impl.GeneroImpl;

@RestController
@RequestMapping("/api/genero")
public class GeneroController {
  
    @Autowired
    private GeneroImpl generoImpl;
    

          @PostMapping("/insertar")
      public Genero insertar(@RequestBody Genero genero) {
        // TODO Auto-generated method stub
        return this.generoImpl.insertar(genero);
    }
}
