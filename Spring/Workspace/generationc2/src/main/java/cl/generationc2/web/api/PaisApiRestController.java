package cl.generationc2.web.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.generationc2.web.models.Pais;
import cl.generationc2.web.services.PaisServiceImpl;

@RestController
public class PaisApiRestController {

	@Autowired
	private PaisServiceImpl psImpl;
	
	
	@RequestMapping("/guardar/pais")
	public Pais guardarPais(@RequestBody Pais pais) {
		
		return psImpl.guardarPais(pais);
		
	}
}
