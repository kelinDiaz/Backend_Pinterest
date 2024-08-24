package hn.unah.pinterest2_proyecto.Services;

import java.util.List;

import hn.unah.pinterest2_proyecto.Entities.Comentario;

public interface ComentarioService {

     public Comentario agregarComentario(Comentario comentario);


     public List<Comentario> obtenerComentariosPorPin(Long codigoPin);

     public Comentario obtenerComentarioPorId(Long codigoComentariLong);

     public void eliminarComentario(Long codigoComentario);

    
}
