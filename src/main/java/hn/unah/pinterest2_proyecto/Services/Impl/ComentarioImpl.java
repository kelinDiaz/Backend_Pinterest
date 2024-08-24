package hn.unah.pinterest2_proyecto.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.pinterest2_proyecto.Entities.Comentario;
import hn.unah.pinterest2_proyecto.Entities.Pin;
import hn.unah.pinterest2_proyecto.Repositories.ComentarioRepository;
import hn.unah.pinterest2_proyecto.Repositories.PinRepository;
import hn.unah.pinterest2_proyecto.Services.ComentarioService;

@Service
public class ComentarioImpl implements ComentarioService{

    @Autowired
    private ComentarioRepository comentarioRepository;

    @Autowired
    private PinRepository pinRepository;

    @Override
    public Comentario agregarComentario(Comentario comentario) {
        // TODO Auto-generated method stub
        return this.comentarioRepository.save(comentario);
    }

    @Override
    public void eliminarComentario(Long codigoComentario) {
        
        if (comentarioRepository.existsById(codigoComentario)) {
            comentarioRepository.deleteById(codigoComentario);
        }   
    }
    

    @Override
    public Comentario obtenerComentarioPorId(Long codigoComentariLong) {
        // TODO Auto-generated method stub
        return this.comentarioRepository.findById(codigoComentariLong).orElse(null);
    }
 
    @Override
    public List<Comentario> obtenerComentariosPorPin(Long codigoPin) {
        // TODO Auto-generated method stub
        Pin pin = pinRepository.findById(codigoPin).orElseThrow(() -> new RuntimeException("Pin no encontrado"));
    return comentarioRepository.findByPin(pin);
    }


}
