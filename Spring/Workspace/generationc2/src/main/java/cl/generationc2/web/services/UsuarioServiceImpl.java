package cl.generationc2.web.services;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.generationc2.web.models.Usuario;
import cl.generationc2.web.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository uRepository;

	@Override
	public Boolean guardarUsuario(Usuario usuario) {
		//validar el usuario(email)
		Usuario retornoUsuario = uRepository.findByCorreo(usuario.getCorreo());
		//sSystem.out.println(retornoUsuario.getCorreo());
		if(retornoUsuario == null) {
			//encripta contraseña 1234->123412321
			String passHashed = BCrypt.hashpw(usuario.getPass(), BCrypt.gensalt());
			usuario.setPass(passHashed);//reemplazando el valor por el hash
			uRepository.save(usuario);
			return true;
		}else {
			return false;
		}
		

	}
	
	
}
