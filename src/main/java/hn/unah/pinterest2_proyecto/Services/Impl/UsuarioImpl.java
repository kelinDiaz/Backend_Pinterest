package hn.unah.pinterest2_proyecto.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import hn.unah.pinterest2_proyecto.Entities.Usuario;
import hn.unah.pinterest2_proyecto.Repositories.UsuarioRepository;
import hn.unah.pinterest2_proyecto.Services.UsuarioService;



@Service
public class UsuarioImpl  implements UsuarioService{


    @Autowired
    private UsuarioRepository usuarioRepository;



    

    @Override
    public List<Usuario> Obtener() {
        // TODO Auto-generated method stub
        return (List<Usuario>)this.usuarioRepository.findAll();
    }
    
    @Override
    public Usuario insertarUsuario(Usuario usuario) {
        // TODO Auto-generated method stub
        return this.usuarioRepository.save(usuario);
    

    }

   @Override
   public Optional<Usuario> login(String correo, String contrasenia) {
       // TODO Auto-generated method stub
       return  this.usuarioRepository.findByCorreoAndContrasenia(correo, contrasenia);
   }



}
