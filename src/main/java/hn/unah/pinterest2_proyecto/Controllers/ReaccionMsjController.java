package hn.unah.pinterest2_proyecto.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.pinterest2_proyecto.Entities.ReaccionMsj;
import hn.unah.pinterest2_proyecto.Services.Impl.ReaccionMsjImpl;

@RestController
@RequestMapping("/api/reaccionMsj")
public class ReaccionMsjController {

     @Autowired
    private ReaccionMsjImpl reaccionMsjImpl;

@PostMapping("insertar")
 public ReaccionMsj insertar( @RequestBody ReaccionMsj reaccionMsj) {
        // TODO Auto-generated method stub
        return this.reaccionMsjImpl.insertar(reaccionMsj);
    }

    
}
