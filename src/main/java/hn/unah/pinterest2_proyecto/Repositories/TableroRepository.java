package hn.unah.pinterest2_proyecto.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import hn.unah.pinterest2_proyecto.Entities.Tablero;

public interface TableroRepository extends CrudRepository<Tablero, Long>{


    /*@Query("SELECT DISTINCT t " +
    "FROM Tablero t JOIN t.pines p " +
    "WHERE p.usuario.codigoUsuario = :codigoUsuario")
List<Tablero> findTablerosByUsuarioCodigo(@Param("codigoUsuario") Long codigoUsuario);*/


@Query("SELECT t FROM Tablero t WHERE t.codigoTablero IN (" +
       "SELECT p.tablero.codigoTablero FROM Pin p WHERE p.usuario.codigoUsuario = :codigoUsuario" +
       ") AND NOT EXISTS (" +
       "SELECT p2 FROM Pin p2 WHERE p2.tablero.codigoTablero = t.codigoTablero AND p2.usuario.codigoUsuario <> :codigoUsuario)")
List<Tablero> findTablerosByUsuarioCodigo(@Param("codigoUsuario") Long codigoUsuario);


    
}