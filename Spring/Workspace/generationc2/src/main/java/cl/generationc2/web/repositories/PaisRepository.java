package cl.generationc2.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.generationc2.web.models.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long>{
//logica de datos se hace el crud
}
