package hn.unah.pinterest2_proyecto.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.pinterest2_proyecto.Entities.Lugar;
import hn.unah.pinterest2_proyecto.Services.Impl.LugarImpl;

@RestController
@RequestMapping("/api/lugar")
public class LugarController {
    
    @Autowired
    private LugarImpl lugarImpl;


       @PostMapping("/insertar")
        public Lugar insertar( @RequestBody Lugar lugar) {
        // TODO Auto-generated method stub
        return this.lugarImpl.insertar(lugar);
    }
    
}
