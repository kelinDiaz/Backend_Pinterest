package hn.unah.pinterest2_proyecto.Services.Impl;




import java.time.LocalDate;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.pinterest2_proyecto.DTOS.PinRequest;
import hn.unah.pinterest2_proyecto.Entities.Etiqueta;
import hn.unah.pinterest2_proyecto.Entities.Pin;

import hn.unah.pinterest2_proyecto.Entities.Tablero;
import hn.unah.pinterest2_proyecto.Entities.Usuario;
import hn.unah.pinterest2_proyecto.Repositories.EtiquetaRepository;
import hn.unah.pinterest2_proyecto.Repositories.PinRepository;
import hn.unah.pinterest2_proyecto.Repositories.TableroRepository;
import hn.unah.pinterest2_proyecto.Repositories.UsuarioRepository;
import hn.unah.pinterest2_proyecto.Services.PinService;



@Service
public class PinImpl  implements PinService{
    
    @Autowired
    private PinRepository pinRepository;

    @Autowired
    private TableroRepository tableroRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private EtiquetaRepository etiquetaRepository;


  @Override
public Pin insertar(PinRequest pinRequest, long codigoUsuario) {


  Usuario usuario = usuarioRepository.findById(codigoUsuario)
        .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

    Tablero tablero = null;
    if (pinRequest.getCodigoTablero() != null) {
      
        tablero = tableroRepository.findById(pinRequest.getCodigoTablero())
            .orElseThrow(() -> new RuntimeException("Tablero no encontrado"));
    } else if (pinRequest.getNombreNuevoTablero() != null) {
      
        tablero = new Tablero();
        tablero.setNombreTablero(pinRequest.getNombreNuevoTablero());
       
        tablero = tableroRepository.save(tablero);
    } else {
      
        throw new RuntimeException("Debe proporcionar un tablero existente o un nombre para crear uno nuevo");
    }

    
    List<Etiqueta> etiquetas = etiquetaRepository.findAllById(pinRequest.getEtiquetasId());

    
    Pin pin = new Pin();
    pin.setTitulo(pinRequest.getTitulo());
    pin.setDescripcion(pinRequest.getDescripcion());
    pin.setUrlPin(pinRequest.getUrlPin());
    pin.setFechaCreacion(LocalDate.now());
    pin.setTablero(tablero);
    pin.setUsuario(usuario);
    pin.setEtiquetas(etiquetas); 

  
    return pinRepository.save(pin);

}
  
   
  @Override
  public List<Pin> buscarPorTituloOCategoria(String criterio) {
      // TODO Auto-generated method stub
      return  this.pinRepository.findByTituloOrCategoria(criterio);
  }



  @Override
  public List<Pin> obtener() {
  // TODO Auto-generated method stub
    return this.pinRepository.findAll();
  }


  @Override
  public List<Pin> getPinsByUser(long codigoUsuario) {
  // TODO Auto-generated method stub
  return this.pinRepository.findPinsByUsuarioCodigo(codigoUsuario);
  }



  @Override
  public Pin obtenerPinPorCodigo(long codigoPin) {
      // TODO Auto-generated method stub
      return pinRepository.findById(codigoPin)
      .orElse(null); 
  }


}


