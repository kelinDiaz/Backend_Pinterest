package hn.unah.pinterest2_proyecto.Entities;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


@Entity
@Table(name = "tbl_comentarios")
public class Comentario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_comentario")
    private Long codigoComentario;

    @ManyToOne
    @JoinColumn(name = "codigo_pin", referencedColumnName = "codigo_pin")
    private Pin pin;

   
    @ManyToOne
    @JoinColumn(name = "codigo_usuario", referencedColumnName = "codigo_usuario")
    private Usuario usuario;

    @Column(name = "fecha_creacion")
     private LocalDate fechaCreacion;

    @Column(name = "contenido_comentario")
    private String contenidoComentario;

    
       // Relación recursiva: un comentario puede tener respuestas (hijos)
       @OneToMany(mappedBy = "comentarioPadre")
       private List<Comentario> respuestas;
   
       // Relación recursiva: un comentario puede tener un comentario padre
       @ManyToOne
       @JoinColumn(name = "codigo_comentario_hijo")
       private Comentario comentarioPadre;
   
    
}
