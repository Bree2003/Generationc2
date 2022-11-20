package cl.generationc2.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.generationc2.web.models.Usuario;
import cl.generationc2.web.repositories.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{
	// logica de negocio del sistema web
	
	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		
		return  usuarioRepository.save(usuario);
	}

	@Override
	public String eliminarUsuario(Long id) {
		// TODO Auto-generated method stub
		
		Boolean existe = usuarioRepository.existsById(id);
		//elimino el usuario pasando el id
		//Usuario usuario = usuarioRepository.findById(id).get();
		//validar si fue eliminado o no el registro
		
		if(existe) {
			usuarioRepository.deleteById(id);
		}else {
			return "Usuario no existe en la tabla";
		}
		
		 existe = usuarioRepository.existsById(id);
		//si es distinto de nulo no fue eliminado
		if(existe) {
			return "usuario no eliminado";
		}
		return "El usuario fue eliminado";
	}

	@Override
	public String actualizarUsuario(Usuario usuario) {
		
		Boolean existe = usuarioRepository.existsById(usuario.getId());
		
		if(existe) {
			usuarioRepository.save(usuario);
			return "usuario actualizado";
		}
		
		return "usuario no actualizado";
	}

	@Override
	public Optional<Usuario> obtenerUsuario(Long id) {
		
		Optional<Usuario> mensaje = usuarioRepository.findById(id);
	
		return mensaje;
	}

	@Override
	public Usuario obtenerUsuario2(Long id) {
Boolean existe = usuarioRepository.existsById(id);
		
		if(existe) {
		Usuario user = usuarioRepository.findById(id).get();
		return user;
		}
		return null;
	}

	@Override
	public List<Usuario> listadoUsuario() {
		//obtener todos los usuarios
		return usuarioRepository.findAll();
	}
	

}
