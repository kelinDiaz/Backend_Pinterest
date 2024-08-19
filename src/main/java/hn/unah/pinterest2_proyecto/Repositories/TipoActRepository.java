package hn.unah.pinterest2_proyecto.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.pinterest2_proyecto.Entities.TipoActividad;

@Repository
public interface TipoActRepository extends CrudRepository<TipoActividad, Long> {
    
}
