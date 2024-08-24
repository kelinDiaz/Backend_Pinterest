package hn.unah.pinterest2_proyecto.Controllers;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.pinterest2_proyecto.DTOS.PinRequest;
import hn.unah.pinterest2_proyecto.Entities.Pin;

import hn.unah.pinterest2_proyecto.Services.Impl.PinImpl;

@RestController
@RequestMapping("/api/pines")
public class PinController {
    
    @Autowired
    private PinImpl pinImpl;

   
    @PostMapping("/insertar/{codigoUsuario}")
    public ResponseEntity<Pin> crearPin(
        @PathVariable long codigoUsuario,
        @RequestBody PinRequest pinRequest
    ) {
        Pin nuevoPin = pinImpl.insertar(pinRequest, codigoUsuario);
        return new ResponseEntity<>(nuevoPin, HttpStatus.CREATED);
    }


    @GetMapping("/buscar")
    public List<Pin> buscarPorTituloOCategoria(@RequestParam String criterio) {
        return pinImpl.buscarPorTituloOCategoria(criterio);
    }

    @GetMapping("/obtener")
    public List<Pin> obtener() {
        // TODO Auto-generated method stub
          return this.pinImpl.obtener();
        }

    @GetMapping("/obtenerbyUsuario/{codigoUsuario}")
     public List<Pin> getPinsByUser( @PathVariable long codigoUsuario){
    return this.pinImpl.getPinsByUser(codigoUsuario);
     }

}
