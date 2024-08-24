package hn.unah.pinterest2_proyecto.Controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import hn.unah.pinterest2_proyecto.Entities.Usuario;
import hn.unah.pinterest2_proyecto.Services.Impl.UsuarioImpl;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    
    @Autowired
    private UsuarioImpl usuarioImpl;


 @GetMapping("/obtener")
   public List<Usuario> Obtener() {
        // TODO Auto-generated method stub
        return (List<Usuario>)this.usuarioImpl.Obtener();
    }

    @PostMapping("/insertar/{codigoGenero}/{codigoIdioma}/{codigoLugar}")
    public Usuario insertarUsuario(@RequestBody Usuario usuario, @PathVariable  long codigoGenero, @PathVariable long codigoIdioma, @PathVariable long codigoLugar){

        return this.usuarioImpl.insertarUsuario(usuario, codigoGenero, codigoIdioma, codigoLugar);
    }

  

    @PostMapping("/login")
    public String login(@RequestBody Usuario loginRequest) {
        Optional<Usuario> usuario = usuarioImpl.login(loginRequest.getCorreo(), loginRequest.getContrasenia());
        
        if (usuario.isPresent()) {
            return "Login exitoso";
        } else {
            return "Credenciales inválidas";
        }
    }   
  
}



