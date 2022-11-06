package cl.generationc2.f20221103;

import java.util.ArrayList;

public class Usuario {
	
	private String nombre;
	private String correo;
	private String password;
	private String apellido;
	private String nick;
	//atributo de colaboracion
	private Direccion direccion;
	private ArrayList<String> telefono;
	
	public Usuario() {
		super();
		this.telefono = new ArrayList<String>(); //recuerda siempre inicializar el arreglo
		this.direccion = new Direccion();
	}
	

	public Usuario(String nombre, String correo, String password, String apellido, String nick, Direccion direccion,
			ArrayList<String> telefono) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
		this.apellido = apellido;
		this.nick = nick;
		this.direccion = direccion;
		this.telefono = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<String> getTelefono() {
		return telefono;
	}

	public void setTelefono(ArrayList<String> telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", correo=" + correo + ", password=" + password + ", apellido=" + apellido
				+ ", nick=" + nick + ", direccion=" + direccion + ", telefono=" + telefono + "]";
	}

	
	

}
