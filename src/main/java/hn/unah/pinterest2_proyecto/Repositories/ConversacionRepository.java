package hn.unah.pinterest2_proyecto.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.pinterest2_proyecto.Entities.Conversacion;
import hn.unah.pinterest2_proyecto.Entities.Usuario;

@Repository
public interface ConversacionRepository extends JpaRepository<Conversacion , Long> {

   public  List<Conversacion> findByUsuarioEmisor(Usuario usuarioEmisor);
    
} 
    
