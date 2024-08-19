package hn.unah.pinterest2_proyecto.Repositories;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import hn.unah.pinterest2_proyecto.Entities.Pin;

public interface PinRepository extends JpaRepository<Pin, Long>{

    
    @Query("SELECT p FROM Pin p WHERE " +
    "LOWER(p.titulo) LIKE LOWER(CONCAT('%', :criterio, '%')) OR " +
    "LOWER(p.categoria.nombreCategoria) LIKE LOWER(CONCAT('%', :criterio, '%'))")
List<Pin> findByTituloOrCategoria(@Param("criterio") String criterio);



}

