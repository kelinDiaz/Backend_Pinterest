package hn.unah.pinterest2_proyecto.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.pinterest2_proyecto.Entities.Lugar;

@Repository
public interface LugarRepository extends CrudRepository<Lugar, Long>{
    
}
