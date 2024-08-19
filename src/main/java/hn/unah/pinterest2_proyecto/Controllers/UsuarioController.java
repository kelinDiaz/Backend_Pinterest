package hn.unah.pinterest2_proyecto.Controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
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

   @PostMapping("/insertar")
    public Usuario insertarUsuario(  @RequestBody Usuario usuario) {
        // TODO Auto-generated method stub
        return this.usuarioImpl.insertarUsuario(usuario);
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



