package cl.generationc2.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.generationc2.web.models.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Long>{

}
