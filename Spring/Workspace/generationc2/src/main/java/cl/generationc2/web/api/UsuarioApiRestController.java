package cl.generationc2.web.api;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.generationc2.web.models.Usuario;
import cl.generationc2.web.services.UsuarioServiceImpl;

@RestController
public class UsuarioApiRestController {
@Autowired
private UsuarioServiceImpl usImpl;
	
	@RequestMapping("/guardar/usuario")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		
		/*
		 * {
		 * nombre:"Mijail",
		 * correo:"a@a.cl",
		 * password: "secret"
		 * }
		 * */
		

		return usImpl.guardarUsuario(usuario);
	}
	
	@RequestMapping("/eliminar/usuario")
	public String eliminarUsuario(@RequestParam(value="id",required = false) Long id
) {
		//llamando al metodo, eliminar en el service
		/*String respuesta = usuarioServiceImpl.eliminarUsuario(id);
		return respuesta;*/
		return usImpl.eliminarUsuario(id);
		
	}
	
	
	@RequestMapping("/actualizar/usuario")
	public String actualizarUsuario(@RequestBody Usuario usuario) {
		
		/*
		 * {
		 * id:1;
		 * nombre:"Mijail",
		 * correo:"a@a.cl",
		 * password: "secret"
		 * }
		 * */
		if(usuario.getId()!=null) {
			String mensaje = usImpl.actualizarUsuario(usuario);
			return mensaje;
		}
			return "no se actualizara ningun usuario";
	}
	
	@RequestMapping("/obtener/usuario")
	public Optional<Usuario> obtenerUsuario(@RequestParam(value="id",required = false) Long id
			){
		
		Optional<Usuario> mensaje = usImpl.obtenerUsuario(id);
				return mensaje;
				
	}
	
	@RequestMapping("/obtener/usuario2")
	public Usuario obtenerUsuario2(@RequestParam(value="id",required = false) Long id){
		
		
		
			return usImpl.obtenerUsuario2(id);
				
	}

	@GetMapping("/listar/usuario")
	public List<Usuario> listadoUsuario(){
		return usImpl.listadoUsuario();
		
	}
	
}
