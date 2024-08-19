package hn.unah.pinterest2_proyecto.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.pinterest2_proyecto.Entities.EstadoMsj;
 
@Repository
public interface EstadoMsjRepository extends CrudRepository<EstadoMsj , Long> {
    
}
