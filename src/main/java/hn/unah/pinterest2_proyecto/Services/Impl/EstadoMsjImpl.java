package hn.unah.pinterest2_proyecto.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.pinterest2_proyecto.Entities.EstadoMsj;
import hn.unah.pinterest2_proyecto.Repositories.EstadoMsjRepository;
import hn.unah.pinterest2_proyecto.Services.EstadoMsjService;

@Service
public class EstadoMsjImpl implements EstadoMsjService{


    @Autowired
    private EstadoMsjRepository estadoMsjRepository;

  @Override
  public EstadoMsj crear(EstadoMsj estadoMsj) {
      // TODO Auto-generated method stub
      return this.estadoMsjRepository.save(estadoMsj);
  }
}
