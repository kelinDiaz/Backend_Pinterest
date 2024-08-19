package hn.unah.pinterest2_proyecto.Entities;

import java.time.LocalDateTime;

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
@Table(name = "tbl_busquedas")
@Data
public class Busqueda {
    
  
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_busqueda")
    private Long codigoBusqueda;

    @Column(name = "termino_busqueda")
    private String terminoBusqueda;


    @ManyToOne
    @JoinColumn(name = "codigo_categoria", referencedColumnName = "codigo_categoria")
    private Categoria categoria;

    @Column(name = "fecha_busqueda")
    private LocalDateTime fechaBusqueda;

    @ManyToOne
    @JoinColumn(name = "codigo_usuario", referencedColumnName = "codigo_usuario")
    private Usuario usuario;



}
