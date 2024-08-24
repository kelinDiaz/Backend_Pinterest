package hn.unah.pinterest2_proyecto.Entities;

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
@Table(name = "tbl_reacciones_pines")
@Data
public class ReaccionPin {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo_reaccion")
    private Long codigoReaccion; 

    @Column(name = "nombre_reaccion")
    private String nombreReaccion;

    @Column(name = "url_icono")
    private String urlIcono;

    @ManyToOne
    @JoinColumn(name = "codigo_pin", referencedColumnName = "codigo_pin")
    private Pin pin;

    @ManyToOne
    @JoinColumn(name = "codigo_usuario", referencedColumnName = "codigo_usuario")
    private Usuario usuario;

    
}



