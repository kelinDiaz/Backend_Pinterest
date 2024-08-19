package hn.unah.pinterest2_proyecto.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_tipo_actividad")
@Data
public class TipoActividad {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "codigo_tipo_actividad")
    private Long codigoTipoActividad; 
    

    @Column(name = "nombre_tipo_actividad")
    private String nombreTipoActividad;
    
}
