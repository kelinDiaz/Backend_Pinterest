package hn.unah.pinterest2_proyecto.Entities;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
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
@Table(name = "tbl_notificaciones")
@Data
public class Notificacion {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_notificacion")
    private long codigoNotificacion;
    
    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;


    @ManyToOne
    @JoinColumn(name = "codigo_usuario_emisor", referencedColumnName = "codigo_usuario")
    private Usuario usuarioEmisor;

    @ManyToOne
    @JoinColumn(name = "codigo_usuario_receptor", referencedColumnName = "codigo_usuario")
    private Usuario usuarioReceptor;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigo_tipo_noti", referencedColumnName = "codigo_tipo_noti")
    private TipoNotificacion tipoNotificacion;


    @ManyToOne
    @JoinColumn(name = "codigo_pin", referencedColumnName = "codigo_pin")
    private Pin pin; 

    
}
