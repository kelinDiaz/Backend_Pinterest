package hn.unah.pinterest2_proyecto.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import hn.unah.pinterest2_proyecto.Entities.Comentario;
import hn.unah.pinterest2_proyecto.Entities.Pin;

public interface ComentarioRepository extends CrudRepository<Comentario ,Long> {

     public List<Comentario> findByPin(Pin pin);
}
