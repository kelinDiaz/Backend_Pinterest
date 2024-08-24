package hn.unah.pinterest2_proyecto.Services;


import java.util.List;
import java.util.Optional;


import hn.unah.pinterest2_proyecto.Entities.Usuario;

public interface UsuarioService {

    public List<Usuario> Obtener();

    public Usuario insertarUsuario(Usuario usuario , long codigoGenero, long codigoIdioma, long codigoLugar);


  

    public Optional<Usuario> login (String correo, String contrasenia);



     public Usuario obtenerUsuarioPorCodigo(long codigoUsuario);
      
    
    
    
}
