package cl.generationc2.web.services;



import org.springframework.stereotype.Service;

import cl.generationc2.web.models.Auto;

@Service
public interface AutoService {

	public Auto guardarAuto(Auto auto);
	
	public Auto obtenerAuto(Long id);
}
