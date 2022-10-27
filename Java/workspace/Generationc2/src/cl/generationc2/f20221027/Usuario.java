package cl.generationc2.f20221027;

public class Usuario {

	//atributos
	private String nombre;
	private String apellido;
	private Integer edad;
	private String correo;
	private String direccion;
	
	//generate constructor using field deselected all
	public Usuario() {
		super();
	}
	//generate constructor using field selected all
	public Usuario(String nombre, String apellido, Integer edad, String correo, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.correo = correo;
		this.direccion = direccion;
	}
	
	//generate getters and setters
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
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void entrada ()
	{
		System.out.println("Estoy en el metodo entrada del objeto");
	}
	
	//generate tostring()
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", correo=" + correo
				+ ", direccion=" + direccion + "]";
	}
	
		
	
	
	
	

}


