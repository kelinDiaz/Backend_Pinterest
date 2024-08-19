package hn.unah.pinterest2_proyecto.Entities;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "tbl_pines")
@Data
public class Pin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_pin")
    private long codigoPin;
    
    @Column(name = "titulo")
    private String titulo; 
     
    @Column(name = "descripcion")
    private String descripcion; 

    @Column(name = "url_pin")
    private String urlPin;

    @Column(name = "fecha_creacion")
    private LocalDate fechaCreacion;
    
    @ManyToOne
    @JoinColumn(name = "codigo_usuario", referencedColumnName = "codigo_usuario")
    
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "codigo_tipo_pin", referencedColumnName = "codigo_tipo_pin")
    
    private TipoPin tipoPin;

    @ManyToOne
    @JoinColumn(name = "codigo_categoria", referencedColumnName = "codigo_categoria")
    private Categoria categoria;

     @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "codigo_tablero", referencedColumnName = "codigo_tablero")
    @JsonIgnore
    private Tablero tablero;


    
}
