package hn.unah.pinterest2_proyecto.Services.Impl;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.pinterest2_proyecto.Entities.Conversacion;

import hn.unah.pinterest2_proyecto.Entities.Usuario;
import hn.unah.pinterest2_proyecto.Repositories.ConversacionRepository;
import hn.unah.pinterest2_proyecto.Repositories.UsuarioRepository;
import hn.unah.pinterest2_proyecto.Services.ConversacionService;

@Service
public class ConversacionImpl implements ConversacionService{

    @Autowired
    private ConversacionRepository conversacionRepository;
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Conversacion insertar(Conversacion conversacion, long usuarioEmisor, long usuarioReceptor) {
        
        Usuario usuarioEmi = usuarioRepository.findById(usuarioEmisor).orElseThrow(() -> new RuntimeException("usuarioEmisor no encontrado"));
        Usuario usuarioRecep = usuarioRepository.findById(usuarioReceptor).orElseThrow(() -> new RuntimeException("usuarioReceptor no encontrado"));

        conversacion.setUsuarioEmisor(usuarioEmi);
        conversacion.setUsuarioReceptor(usuarioRecep);
        conversacion.setFechaCreacion(LocalDate.now());

        return this.conversacionRepository.save(conversacion);
    }
    

   
}
