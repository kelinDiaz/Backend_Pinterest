package hn.unah.pinterest2_proyecto.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.pinterest2_proyecto.Entities.Conversacion;
import hn.unah.pinterest2_proyecto.Entities.EstadoMsj;
import hn.unah.pinterest2_proyecto.Entities.Mensaje;
import hn.unah.pinterest2_proyecto.Entities.ReaccionMsj;
import hn.unah.pinterest2_proyecto.Repositories.ConversacionRepository;
import hn.unah.pinterest2_proyecto.Repositories.EstadoMsjRepository;
import hn.unah.pinterest2_proyecto.Repositories.MensajeRepository;
import hn.unah.pinterest2_proyecto.Repositories.ReaccionMsjRepository;
import hn.unah.pinterest2_proyecto.Services.MensajeService;

@Service
public class MensajeImpl implements MensajeService {
     
    @Autowired
    private MensajeRepository mensajeRepository;

    @Autowired
    private ConversacionRepository conversacionRepository;

    @Autowired
    private EstadoMsjRepository estadoMsjRepository;

    @Autowired
    private ReaccionMsjRepository reaccionMsjRepository;

@Override
public Mensaje crearMensaje(Mensaje mensaje, long codigoCvs, long codigoEstadoMsj, Long codigoReaccion) {
   
    Conversacion conversacion = conversacionRepository.findById(codigoCvs)
        .orElseThrow(() -> new RuntimeException("Conversación no encontrada con ID: " + codigoCvs));

    EstadoMsj estadoMsj = estadoMsjRepository.findById(codigoEstadoMsj)
        .orElseThrow(() -> new RuntimeException("Estado del mensaje no encontrado con ID: " + codigoEstadoMsj));

    // Crear mensaje
    Mensaje nuevoMensaje = new Mensaje();
    nuevoMensaje.setConversacion(conversacion);
    nuevoMensaje.setContenidoMsj(mensaje.getContenidoMsj());
    nuevoMensaje.setEstadoMsj(estadoMsj);
    nuevoMensaje.setFechaMensaje(mensaje.getFechaMensaje());
    nuevoMensaje.setUrlArchivo(mensaje.getUrlArchivo());

    // Asignar reacción si está presente
    if (codigoReaccion != null) {
        ReaccionMsj reaccionMsj = reaccionMsjRepository.findById(codigoReaccion)
            .orElseThrow(() -> new RuntimeException("Reacción no encontrada con ID: " + codigoReaccion));
        nuevoMensaje.setReaccionMsj(reaccionMsj);
    }

    return mensajeRepository.save(nuevoMensaje);
}
}


