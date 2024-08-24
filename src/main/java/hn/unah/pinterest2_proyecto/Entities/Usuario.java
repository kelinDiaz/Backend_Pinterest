package hn.unah.pinterest2_proyecto.Entities;


import java.time.LocalDate;


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
@Table(name = "tbl_usuarios")
@Data
public class Usuario {
    
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name = "codigo_usuario")
    private long codigoUsuario; 

    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    
    @Column(name = "correo")
    private String correo; 

    @Column(name = "contrasenia")
    private String contrasenia;

    @Column(name = "url_perfil")
    private String urlPerfil; 

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @ManyToOne 
    @JoinColumn(name = "codigo_genero", referencedColumnName = "codigo_genero")
    private Genero  genero; 

    @ManyToOne
    @JoinColumn(name = "codigo_idioma", referencedColumnName = "codigo_idioma")
    private Idioma idioma;
    
    @ManyToOne 
    @JoinColumn(name = "codigo_lugar", referencedColumnName = "codigo_lugar")
    private Lugar lugar;


}
