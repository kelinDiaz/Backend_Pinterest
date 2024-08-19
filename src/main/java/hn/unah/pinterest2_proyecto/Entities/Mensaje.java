package hn.unah.pinterest2_proyecto.Entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_mensajes")
@Data
public class Mensaje {


      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_msj")
    private long codigoMsj;
   
    @ManyToOne
    @JoinColumn(name = "codigo_cvs", referencedColumnName = "codigo_cvs")
     private Conversacion conversacion;
     
     @Column(name = "contenido_msj")
     private String contenidoMsj;

     @ManyToOne
     @JoinColumn(name = "codigo_estado_msj", referencedColumnName = "codigo_estado_msj")
     private EstadoMsj estadoMsj;


    @ManyToOne(optional = true)
     @JoinColumn(name = "codigo_reaccion", referencedColumnName = "codigo_reaccion")
     private ReaccionMsj reaccionMsj;


    @Column(name = "fecha_msj")
    private Date fechaMensaje;
    
    @Column(name = "url_archivo")
    private String urlArchivo;
    
}