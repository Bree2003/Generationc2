package cl.generationc2.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cl.generationc2.web.models.Usuario;
import cl.generationc2.web.services.UsuarioServiceImpl;

@Controller
@RequestMapping("/registro")
public class RegistroController {

	@Autowired
	private UsuarioServiceImpl usImpl;
	//capturar la url y desplegar el jsp(controlador)
	//llenamos el formulario(vista)
	//enviamos el formulario(vista) al controlador
	//capturar la url
	//capturar los parametros
	//enviar a base de datos
	
	//http://localhost:8080/registro/usuario
	@GetMapping("/usuario")
	public String mostrarFormulario() {
		return "registro.jsp";
	}
	
	@PostMapping("/usuario")
	//capturar los parametros @RequestParam
	public String guardarFormulario(@RequestParam("nombre") String nombre,
			@RequestParam("apellido") String apellido,
			@RequestParam("nick") String nick,
			@RequestParam("correo") String correo,
			@RequestParam("pass") String pass,
			@RequestParam("pass2") String pass2,
			Model model
			) {
		
		if(pass.equals(pass2)) {
			//instanciar un objeto usuario
			Usuario usuario = new Usuario();
			usuario.setNombre(nombre);
			usuario.setApellido(apellido);
			usuario.setCorreo(correo);
			usuario.setPass(pass);
			usuario.setNick(nick);
			usuario.setPass2(pass2);
			//enviar a base datos
			Boolean resultado = usImpl.guardarUsuario(usuario);
			if(resultado) { //al ser boolean ya retorna verdadero o falso
				model.addAttribute("msgOk", "Registro exitoso");
				return "login.jsp"; //enviar a una vista
			}else {
				model.addAttribute("msgError" ,"Correo ya registrado" );
				return "registro.jsp";
			}
			
			
			
		}else {
			model.addAttribute("msgError" ,"Password distintos" );
			return "registro.jsp";
		}
		
		
	}
	
	// desplegar el jsp
	@GetMapping("/login")
	public String login() {
		return "login.jsp";
	}
	
	//captural el email y password
	@PostMapping("/login")
	public String ingresarUsuario(@RequestParam("correo") String correo,
			@RequestParam("pass") String pass,
			Model model) { //pasar frontend a backend
		
		
		//llamando al metodo
		Boolean login = usImpl.ingresarUsuario(correo, pass);
		if(login) {//login correcto
			//ir a una ruta interna
			return "redirect:/home";
		}else {
			model.addAttribute("msgError", "Por favor verifica tus datos ingresados");
			return "login.jsp";
		}
	
	}

	
}
