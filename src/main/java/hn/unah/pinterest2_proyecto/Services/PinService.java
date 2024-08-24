package hn.unah.pinterest2_proyecto.Services;



import java.util.List;

import hn.unah.pinterest2_proyecto.DTOS.PinRequest;
import hn.unah.pinterest2_proyecto.Entities.Pin;

public interface PinService {

    public Pin insertar(PinRequest pinRequest, long codigoUsuario);
 
    public List<Pin> obtener();

    public List<Pin> buscarPorTituloOCategoria(String criterio);

    
    public List<Pin> getPinsByUser(long codigoUsuario);

    public Pin obtenerPinPorCodigo(long codigoPin);


    
    
}
