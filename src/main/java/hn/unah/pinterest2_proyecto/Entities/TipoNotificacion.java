package hn.unah.pinterest2_proyecto.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_tipo_notificacion")
@Data
public class TipoNotificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_tipo_noti")
    private Long codigoTipoNotificacion;


    @Column(name = "nombre_tipo_noti")
    private String nombreTipoNotificacion;
    
}
