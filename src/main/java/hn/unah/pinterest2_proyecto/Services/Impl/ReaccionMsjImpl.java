package hn.unah.pinterest2_proyecto.Services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.pinterest2_proyecto.Entities.ReaccionMsj;
import hn.unah.pinterest2_proyecto.Repositories.ReaccionMsjRepository;
import hn.unah.pinterest2_proyecto.Services.ReaccionMsjService;

@Service
public class ReaccionMsjImpl implements ReaccionMsjService {


    @Autowired
    private ReaccionMsjRepository reaccionMsjRepository;
    @Override
    public ReaccionMsj insertar(ReaccionMsj reaccionMsj) {
        // TODO Auto-generated method stub
        return this.reaccionMsjRepository.save(reaccionMsj);
    }
    
}
