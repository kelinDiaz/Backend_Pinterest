package hn.unah.pinterest2_proyecto.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import hn.unah.pinterest2_proyecto.Entities.Pin;
import hn.unah.pinterest2_proyecto.Entities.ReaccionPin;
import hn.unah.pinterest2_proyecto.Entities.Usuario;
import hn.unah.pinterest2_proyecto.Services.Impl.PinImpl;
import hn.unah.pinterest2_proyecto.Services.Impl.ReaccionPinImpl;
import hn.unah.pinterest2_proyecto.Services.Impl.UsuarioImpl;

@RestController
@RequestMapping("/api/reaccionPin")
public class ReaccionPinController {


    @Autowired
    private ReaccionPinImpl reaccionPinImpl;
    
    @Autowired
    private PinImpl pinImpl;

    @Autowired
    private UsuarioImpl usuarioImpl;

    @PostMapping("/corazon/{codigoPin}/{codigoUsuario}")
    public ResponseEntity<ReaccionPin> darCorazon(
            @PathVariable long codigoPin,
            @PathVariable long codigoUsuario) {

        // Buscar el pin por ID
        Pin pin = pinImpl.obtenerPinPorCodigo(codigoPin);
        if (pin == null) {
            return ResponseEntity.badRequest().body(null); // Manejo de error
        }

        // Buscar el usuario por ID
        Usuario usuario = usuarioImpl.obtenerUsuarioPorCodigo(codigoUsuario);
        if (usuario == null) {
            return ResponseEntity.badRequest().body(null); // Manejo de error
        }

        // Dar la reacción de corazón al pin
        ReaccionPin reaccion = reaccionPinImpl.darCorazon(pin, usuario);

        // Retornar la respuesta
        return ResponseEntity.ok(reaccion);
    }
    
}
