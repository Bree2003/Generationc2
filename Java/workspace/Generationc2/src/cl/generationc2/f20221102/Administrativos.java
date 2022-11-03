package cl.generationc2.f20221102;

public class Administrativos extends Colegio {

	private String cargo;
	private String area;
	
	
	public Administrativos() {
		super();
	}
	public Administrativos(String cargo, String area) {
		super();
		this.cargo = cargo;
		this.area = area;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Administrativos [cargo=" + cargo + ", area=" + area + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + ", getCorreo()=" + getCorreo()
				+ "]";
	}
	
	
	
	
}
	

