package hn.unah.pinterest2_proyecto.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hn.unah.pinterest2_proyecto.Entities.Mensaje;

public interface MensajeRepository extends JpaRepository<Mensaje, Long>{
    
}
