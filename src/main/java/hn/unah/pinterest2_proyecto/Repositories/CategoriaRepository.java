package hn.unah.pinterest2_proyecto.Repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import hn.unah.pinterest2_proyecto.Entities.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria ,Long>{
    
    

    }
