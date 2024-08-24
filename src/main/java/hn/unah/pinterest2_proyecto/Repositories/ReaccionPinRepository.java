package hn.unah.pinterest2_proyecto.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.pinterest2_proyecto.Entities.Pin;
import hn.unah.pinterest2_proyecto.Entities.ReaccionPin;
import hn.unah.pinterest2_proyecto.Entities.Usuario;

public interface ReaccionPinRepository  extends JpaRepository<ReaccionPin ,Long>{
     
    Optional<ReaccionPin> findByPinAndUsuario(Pin pin, Usuario usuario);
    
}
