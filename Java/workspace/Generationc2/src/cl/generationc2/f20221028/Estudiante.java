package cl.generationc2.f20221028;

public class Estudiante {
	//atributos
	private String nombre;
	private String apellido;
	private Integer edad;
	private String rut;
	private String curso;
	private String correo;
	private Integer telefono;

	//constructores
	public Estudiante() {
		super();
	}

	public Estudiante(String nombre, String apellido, Integer edad, String rut, String curso, String correo, Integer telefono) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.rut = rut;
		this.curso = curso;
		this.correo = correo;
		this.telefono = telefono;
	}

	public Estudiante(String nombre, String apellido, String rut) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.rut = rut;
	}
	
	
	public Estudiante(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}

	//getter y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	
	

	//metodos
	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", rut=" + rut
				+ ", curso=" + curso + ", correo=" + correo + ", telefono=" + telefono + "]";
	}
	
}
