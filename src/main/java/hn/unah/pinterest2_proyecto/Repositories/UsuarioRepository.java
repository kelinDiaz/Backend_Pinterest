package hn.unah.pinterest2_proyecto.Repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.pinterest2_proyecto.Entities.Usuario;

@Repository
public interface UsuarioRepository  extends CrudRepository<Usuario,Long>{

    Optional<Usuario> findByCorreoAndContrasenia(String correo, String contrasenia);
    
}
