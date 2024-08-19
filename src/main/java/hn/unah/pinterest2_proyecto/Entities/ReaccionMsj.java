package hn.unah.pinterest2_proyecto.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_reacciones_mensajes")
@Data
public class ReaccionMsj {


     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_reaccion")
    private long codigoReaccion;
     
    @Column(name = "nombre_reaccion")
    private String nombreReaccion;

    @Column(name = "url_icono")
    private String urlIcono;



    
}
