package hn.unah.pinterest2_proyecto.Services.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.pinterest2_proyecto.Entities.Genero;
import hn.unah.pinterest2_proyecto.Entities.Idioma;
import hn.unah.pinterest2_proyecto.Entities.Lugar;
import hn.unah.pinterest2_proyecto.Entities.Usuario;
import hn.unah.pinterest2_proyecto.Repositories.GeneroRepository;
import hn.unah.pinterest2_proyecto.Repositories.IdiomaRepositoty;
import hn.unah.pinterest2_proyecto.Repositories.LugarRepository;
import hn.unah.pinterest2_proyecto.Repositories.UsuarioRepository;
import hn.unah.pinterest2_proyecto.Services.UsuarioService;



@Service
public class UsuarioImpl  implements UsuarioService{


    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private GeneroRepository generoRepository;

    @Autowired
    private LugarRepository lugarRepository;

    @Autowired
    private IdiomaRepositoty idiomaRepositoty;



    

    @Override
    public List<Usuario> Obtener() {
        // TODO Auto-generated method stub
        return (List<Usuario>)this.usuarioRepository.findAll();
    }
    
    @Override
    public Usuario insertarUsuario(Usuario usuario, long codigoGenero, long codigoIdioma, long codigoLugar) {
       
         // Buscar las entidades existentes basadas en los códigos proporcionados
        Genero genero = generoRepository.findById(codigoGenero)
                .orElseThrow(() -> new RuntimeException("Genero no encontrado con el código: " + codigoGenero));
        Idioma idioma = idiomaRepositoty.findById(codigoIdioma)
                .orElseThrow(() -> new RuntimeException("Idioma no encontrado con el código: " + codigoIdioma));
        Lugar lugar = lugarRepository.findById(codigoLugar)
                .orElseThrow(() -> new RuntimeException("Lugar no encontrado con el código: " + codigoLugar));

        // Asignar los valores al usuario
        usuario.setGenero(genero);
        usuario.setIdioma(idioma);
        usuario.setLugar(lugar);

        // Guardar el usuario en la base de datos
        return usuarioRepository.save(usuario);
    }
    


   @Override
   public Optional<Usuario> login(String correo, String contrasenia) {
       // TODO Auto-generated method stub
       return  this.usuarioRepository.findByCorreoAndContrasenia(correo, contrasenia);
   }

}

