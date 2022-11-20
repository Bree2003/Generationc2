package cl.generationc2.web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cl.generationc2.web.models.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
//repository-> la logica de manipulacion de datos (CRUD y mas cosas)
}
