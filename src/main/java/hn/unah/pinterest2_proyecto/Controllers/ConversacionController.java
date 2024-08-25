package hn.unah.pinterest2_proyecto.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.pinterest2_proyecto.Entities.Conversacion;
import hn.unah.pinterest2_proyecto.Services.Impl.ConversacionImpl;

@RestController
@RequestMapping("/api/conversacion")
public class ConversacionController {

    @Autowired
    private ConversacionImpl conversacionImpl;
  
    @PostMapping("/insertar")
    public Conversacion insertar(@RequestBody Conversacion conversacion, @RequestParam long usuarioEmisor, @RequestParam long usuarioReceptor){

     return this.conversacionImpl.insertar(conversacion, usuarioEmisor, usuarioReceptor);
    }
  


     @GetMapping("/obtenerByEmisor/{usuarioEmisor}")
    public List<Conversacion> Obtener(@PathVariable long usuarioEmisor){
     
        return this.conversacionImpl.Obtener(usuarioEmisor);

    }


    
}
