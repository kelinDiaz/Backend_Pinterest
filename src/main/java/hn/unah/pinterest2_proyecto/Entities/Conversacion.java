package hn.unah.pinterest2_proyecto.Entities;


import java.time.LocalDate;

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
@Table(name = "tbl_conversaciones")
@Data
public class Conversacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_cvs")
    private long codigoCvs;

    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;
    
    
    @ManyToOne
    @JoinColumn(name = "codigo_usuario_emisor",referencedColumnName = "codigo_usuario")
    private Usuario usuarioEmisor; 

    @ManyToOne
    @JoinColumn(name = "codigo_usuario_receptor",referencedColumnName = "codigo_usuario")
    private Usuario usuarioReceptor; 

}
