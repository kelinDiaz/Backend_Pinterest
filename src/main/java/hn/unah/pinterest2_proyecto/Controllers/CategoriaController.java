package hn.unah.pinterest2_proyecto.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.pinterest2_proyecto.Entities.Categoria;
import hn.unah.pinterest2_proyecto.Services.Impl.CategoriaImpl;

@RestController
@RequestMapping("/api/categorias")
public class CategoriaController {

     @Autowired
    private CategoriaImpl categoriaImpl;


    @PostMapping("/insertar")
     public Categoria insertar( @RequestBody Categoria categoria) {
        // TODO Auto-generated method stub
        return this.categoriaImpl.insertar(categoria);
    }
    
}
