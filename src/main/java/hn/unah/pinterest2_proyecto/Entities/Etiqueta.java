package hn.unah.pinterest2_proyecto.Entities;



import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_etiquetas")
@Data
public class Etiqueta {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_etiqueta")
    private long codigoEtiqueta;

    @Column(name = "nombre_etiqueta")
    private String nombreEtiqueta;


    @ManyToMany(mappedBy = "etiquetas")
    @JsonIgnore
    private List<Pin> pines;

    
}
