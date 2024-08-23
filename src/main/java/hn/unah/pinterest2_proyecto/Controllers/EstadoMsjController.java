package hn.unah.pinterest2_proyecto.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.pinterest2_proyecto.Entities.EstadoMsj;

import hn.unah.pinterest2_proyecto.Services.Impl.EstadoMsjImpl;

@RestController
@RequestMapping("/api/estadosMsj")
public class EstadoMsjController {

     @Autowired
    private EstadoMsjImpl estadoMsjImpl;


@PostMapping("/insertar")
  public EstadoMsj crear(@RequestBody EstadoMsj estadoMsj) {
      // TODO Auto-generated method stub
      return this.estadoMsjImpl.crear(estadoMsj);
  }

    
}
