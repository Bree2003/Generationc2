package cl.generationc2.f20221102;

public class Profesores extends Colegio {

	private String especialidad;
	private String jefatura;
	
	public Profesores() {
		super();
	}
	public Profesores(String especialidad, String jefatura) {
		super();
		this.especialidad = especialidad;
		this.jefatura = jefatura;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getJefatura() {
		return jefatura;
	}
	public void setJefatura(String jefatura) {
		this.jefatura = jefatura;
	}
	@Override
	public String toString() {
		return "Profesores [especialidad=" + especialidad + ", jefatura=" + jefatura + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + ", getCorreo()=" + getCorreo()
				+ "]";
	}
	
	
	
}


