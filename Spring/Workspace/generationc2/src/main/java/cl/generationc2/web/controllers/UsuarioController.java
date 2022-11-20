package cl.generationc2.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	//htpps://localhost:8080/
	@RequestMapping("/usuario/")
	public String getUsuario() {
		System.out.println("metodo de obtener usuario");
		return "index.jsp";
		
	}
	//https://localhost:8080/home
	@RequestMapping("/usuario/home")
	public String home() {
		System.out.println("en el metodo home");
		return "home";
	}
	
	//https://localhost:8080/brisa/sandoval
		@RequestMapping("/usuario/brisa/sandoval")
		public String brisasandoval() {
			System.out.println("en el metodo de brisa");
			return "Brisa Sandoval";
		}
}
