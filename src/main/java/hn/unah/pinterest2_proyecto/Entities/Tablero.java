package hn.unah.pinterest2_proyecto.Entities;



import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "tbl_tableros")
@Data
public class Tablero {

    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_tablero")
    private long codigoTablero; 

   @Column(name = "nombre_tablero")
    private String nombreTablero;

 
     @OneToMany(mappedBy = "tablero")
    private List<Pin> pines;

    
}
