package hn.unah.pinterest2_proyecto.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.pinterest2_proyecto.Entities.Idioma;
import hn.unah.pinterest2_proyecto.Services.Impl.IdiomaImpl;

@RestController
@RequestMapping("/api/idioma")
public class IdiomaController {

    @Autowired
    private IdiomaImpl idiomaImpl;

    @PostMapping("/insertar")
      public Idioma insertar( @RequestBody Idioma idioma) {
        // TODO Auto-generated method stub
        return this.idiomaImpl.insertar(idioma);
    }

    @GetMapping("/obtener")
    public List<Idioma> obtener(){

       return this.idiomaImpl.obtener();
    }
    
}
