package hn.unah.pinterest2_proyecto.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.pinterest2_proyecto.Entities.Tablero;
import hn.unah.pinterest2_proyecto.Services.Impl.TableroImpl;

@RestController
@RequestMapping("/api/tableros")
public class TableroController {

     @Autowired
    private TableroImpl tableroImpl;


        @PostMapping("/insertar")
        public Tablero insertar(@RequestBody Tablero tablero ) {
        // TODO Auto-generated method stub
        return this.tableroImpl.insertar(tablero);
    }

    @GetMapping("/obtenerByUsuario/{codigoUsuario}")
    public List<Tablero> obtenerTablerosPorUsuario( @PathVariable Long codigoUsuario){
        return this.tableroImpl.obtenerTablerosPorUsuario(codigoUsuario);
    }
}
