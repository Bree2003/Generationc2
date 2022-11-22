package cl.generationc2.web.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.generationc2.web.models.Rol;
import cl.generationc2.web.models.Usuario;
import cl.generationc2.web.services.RolServiceImpl;

@RestController
public class RolApiRestController {
	
	@Autowired
	private RolServiceImpl rsImpl;

	@RequestMapping("/obtener/rol")
	public Rol obtenerRol(Long id) {
		return rsImpl.obtenerRol(id);
	}

	@RequestMapping("/obtener/rol2")
	public Rol obtenerUsuario(@RequestParam(value="id",required = true) Long id) {
		Rol rol = rsImpl.obtenerRol(id);
		// obteniendo lista de usuario para un mismo rol
		List<Usuario> usuarios =  rol.getUsuarios();		// recorrer la lista
		for(Usuario usuario : usuarios){
			// obteniendo un registro especifico
			System.out.println(usuario.getNombre());
		}
		return rol;
	}

	
}
