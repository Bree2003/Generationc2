package cl.generationc2.web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import cl.generationc2.web.models.Usuario;

@Service
public interface UsuarioService {
	//service-> logica de negocios del sistema web
	
	//definir metodos para crud usuario
	public Usuario guardarUsuario(Usuario usuario);
	//esto es una definicion
	
	public String eliminarUsuario(Long id);
	
	public String actualizarUsuario(Usuario usuario);
	
	public Optional<Usuario> obtenerUsuario(Long id);
	
	public Usuario obtenerUsuario2(Long id);
	
	public List<Usuario> listadoUsuario();
}
