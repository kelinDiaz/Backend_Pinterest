package hn.unah.pinterest2_proyecto.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_tipo_pin")
@Data
public class TipoPin {
      
    @Id
    @Column(name = "codigo_tipo_pin")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigoTipoPin;

    @Column(name = "nombre_tipo_pin")
    private String nombreTipoPin;
}
