package cl.generationc2.f20221102;

public class Alumno extends Colegio{

	private String curso;
	private Float promedio;
	public Alumno() {
		super();
	}
	public Alumno(String curso, Float promedio) {
		super();
		this.curso = curso;
		this.promedio = promedio;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public Float getPromedio() {
		return promedio;
	}
	public void setPromedio(Float promedio) {
		this.promedio = promedio;
	}
	@Override
	public String toString() {
		return "Alumno [curso=" + curso + ", promedio=" + promedio + ", getNombre()=" + getNombre() + ", getApellido()="
				+ getApellido() + ", getEdad()=" + getEdad() + ", getCorreo()=" + getCorreo() + "]";
	}
	
	
	
}
