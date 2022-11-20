package cl.generationc2.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.generationc2.web.models.Rol;
import cl.generationc2.web.services.RolServiceImpl;

@RestController
public class RolApiRestController {
	
	@Autowired
	private RolServiceImpl rsImpl;

	@RequestMapping("/obtener/rol")
	public Rol obtenerRol(Long id) {
		return rsImpl.obtenerRol(id);
	}
	
}
