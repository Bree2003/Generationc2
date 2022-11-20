package cl.generationc2.web.api;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//rutas estaticas
@RestController
@RequestMapping("/api")
public class ApiRestController {
	@RequestMapping("/hola")
	public String hola() {
		return "hola api";
	}

//rutas dinamicas
	@RequestMapping("/edad/{edad}")
	public String rutaDinamica(@PathVariable("edad") int edad) {
		return "capturando edad:"+edad;
	}
	
	@RequestMapping("/nombre/{nombre}/{apellido}")
	public String rutaDinamica(@PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido) {
		return "capturando nombre:"+nombre+" "+apellido;
	}
	
	
	@RequestMapping("fecha/{dia}/{mes}/{ano}")
	public String fecha(@PathVariable("dia") int dia,@PathVariable("mes")String mes,@PathVariable("ano") int ano) {
		return "fecha:"+dia+"/"+mes+"/"+ano;
	}
	
	// https://localhost:8080/api/usuario?usuarioId=1
	// peticion de tipo get
	
	//http://localhost:8080/api/usuario?usuarioId=1//GET
		@RequestMapping("/usuario")
		public String parametro(@RequestParam(value="usuarioId",required = false) Integer id ) {
			//int , long , float =0
			//Integer, Float, Long... pueden ser nulos
			if(id == null) {
				return "parametro no existe";
			}else {
				return "parametro por get "+id;
			}
		}

		
		//http://localhost:8080/api/usuario2?usuarioId=1&nombre=brisa
		@RequestMapping("/usuario2")
		public String parametro2(@RequestParam(value="usuarioId",required = false) Integer id ,
				@RequestParam(value="nombre",required = false) String nombre) {
			//int , long , float =0
			//Integer, Float, Long... pueden ser nulos
			if(id == null) {
				return "parametro no existe";
			}else {
				return "parametro por get "+id + " nombre "+ nombre;
			}
		}


		
}
