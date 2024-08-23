package hn.unah.pinterest2_proyecto.Services.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.pinterest2_proyecto.Entities.Tablero;

import hn.unah.pinterest2_proyecto.Repositories.TableroRepository;
import hn.unah.pinterest2_proyecto.Services.TablerosService;

@Service
public class TableroImpl  implements TablerosService{
     
    @Autowired
    private TableroRepository tableroRepository;




    @Override
    public Tablero insertar(Tablero tablero) {
        // TODO Auto-generated method stub
        return this.tableroRepository.save(tablero);
    }

    
  
    @Override
    public List<Tablero> obtenerTablerosPorUsuario(Long codigoUsuario) {
        // TODO Auto-generated method stub
        return this.tableroRepository.findTablerosByUsuarioCodigo(codigoUsuario);
    }
   
}
