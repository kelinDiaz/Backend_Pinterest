package hn.unah.pinterest2_proyecto.Services.Impl;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import hn.unah.pinterest2_proyecto.Entities.Pin;
import hn.unah.pinterest2_proyecto.Entities.Tablero;


import hn.unah.pinterest2_proyecto.Repositories.PinRepository;
import hn.unah.pinterest2_proyecto.Repositories.TableroRepository;

import hn.unah.pinterest2_proyecto.Services.PinService;


@Service
public class PinImpl  implements PinService{
    
    @Autowired
    private PinRepository pinRepository;

    @Autowired
    private TableroRepository tableroRepository;

   

  
    
    @Override
    public Pin insertar(Pin pin, long codigo_tablero) {
    
     Tablero tablero = tableroRepository.findById(codigo_tablero)
     .orElseThrow(() -> new RuntimeException("Tablero no encontrado"));

     pin.setTablero(tablero);

        return this.pinRepository.save(pin);
    }

  @Override
  public List<Pin> buscarPorTituloOCategoria(String criterio) {
      // TODO Auto-generated method stub
      return  this.pinRepository.findByTituloOrCategoria(criterio);
  }

}


