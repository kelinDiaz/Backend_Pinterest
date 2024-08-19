package hn.unah.pinterest2_proyecto.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_lugares")
@Data
public class Lugar {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_lugar")
    private long codigoLugar;

    @Column(name = "nombre_lugar")
    private String nombreLugar;

    
}
