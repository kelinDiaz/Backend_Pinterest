package hn.unah.pinterest2_proyecto.Services;

import hn.unah.pinterest2_proyecto.Entities.Pin;
import hn.unah.pinterest2_proyecto.Entities.ReaccionPin;
import hn.unah.pinterest2_proyecto.Entities.Usuario;

public interface ReaccionPinService {

      public ReaccionPin darCorazon (Pin pin, Usuario usuario);
}
