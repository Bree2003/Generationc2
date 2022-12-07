package cl.generationc2.web.services;

import cl.generationc2.web.models.Usuario;

public interface UsuarioService {
	//definir metodos para CRUD usuario
	public Boolean guardarUsuario(Usuario usuario);
	//login
	public Boolean ingresarUsuario(String correo,String pass);

}
