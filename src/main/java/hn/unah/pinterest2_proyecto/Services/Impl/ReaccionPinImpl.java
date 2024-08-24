package hn.unah.pinterest2_proyecto.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.pinterest2_proyecto.Entities.Pin;
import hn.unah.pinterest2_proyecto.Entities.ReaccionPin;
import hn.unah.pinterest2_proyecto.Entities.Usuario;
import hn.unah.pinterest2_proyecto.Repositories.ReaccionPinRepository;
import hn.unah.pinterest2_proyecto.Services.ReaccionPinService;

@Service
public class ReaccionPinImpl implements ReaccionPinService {

    @Autowired
    private ReaccionPinRepository reaccionPinRepository;

    @Override
    public ReaccionPin darCorazon(Pin pin, Usuario usuario) {
        // TODO Auto-generated method stub
        ReaccionPin reaccion = new ReaccionPin();
        reaccion.setPin(pin);
        reaccion.setUsuario(usuario);
        reaccion.setNombreReaccion("corazon");

        return reaccionPinRepository.save(reaccion);
    }
    
}
