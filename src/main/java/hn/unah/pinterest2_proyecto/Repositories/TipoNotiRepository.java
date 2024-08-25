package hn.unah.pinterest2_proyecto.Repositories;

import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import hn.unah.pinterest2_proyecto.Entities.TipoNotificacion;

@Repository
public interface TipoNotiRepository extends CrudRepository<TipoNotificacion , Long>{

    
    @Query("SELECT t FROM TipoNotificacion t WHERE t.nombreTipoNotificacion = :nombre")
    TipoNotificacion findByNombreTipoNotificacion(@Param("nombre") String nombre);
    
}
