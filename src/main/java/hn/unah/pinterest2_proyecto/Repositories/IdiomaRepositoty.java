package hn.unah.pinterest2_proyecto.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import hn.unah.pinterest2_proyecto.Entities.Idioma;

@Repository
public interface IdiomaRepositoty extends CrudRepository<Idioma, Long> {
    
}
