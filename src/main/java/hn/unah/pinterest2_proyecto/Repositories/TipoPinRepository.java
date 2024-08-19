package hn.unah.pinterest2_proyecto.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.pinterest2_proyecto.Entities.TipoPin;

@Repository
public interface TipoPinRepository extends CrudRepository<TipoPin ,Long> {
    
}
