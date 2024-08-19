package hn.unah.pinterest2_proyecto.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.pinterest2_proyecto.Entities.TipoNotificacion;

@Repository
public interface TipoNotiRepository extends CrudRepository<TipoNotificacion , Long>{
    
}
