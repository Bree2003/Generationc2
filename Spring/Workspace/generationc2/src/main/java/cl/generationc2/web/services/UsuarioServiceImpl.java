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

	@Override
	public Boolean ingresarUsuario(String correo, String pass) {
		System.out.println(correo+" "+pass);
		Usuario usuario = uRepository.findByCorreo(correo);
		//validar
		if(usuario!=null) {//existe
			
			//comparar contraseñas
			//return BCrypt.checkpw(pass, usuario.getPass());
			Boolean resultado = BCrypt.checkpw(pass, usuario.getPass());
			
			
			//validar, comprobar,probar
			if(resultado) {
				return true;
			}else {
				return false;
			}
		}else {//no existe el email en bd
			return false;
		}
		
	}
	
	
}
