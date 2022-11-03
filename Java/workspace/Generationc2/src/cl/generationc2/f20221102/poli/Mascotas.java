package cl.generationc2.f20221102.poli;

public class Mascotas {

	//atributo
	private String raza;
	private String nombre;
	private String sexo;
	private String sonido;
	
	//constructores
	public Mascotas() {
		super();
	}

	public Mascotas(String raza, String nombre, String sexo, String sonido) {
		super();
		this.raza = raza;
		this.nombre = nombre;
		this.sexo = sexo;
		this.sonido = sonido;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}
	
	
	
	@Override
	public String toString() {
		return "Mascotas [raza=" + raza + ", nombre=" + nombre + ", sexo=" + sexo + ", sonido=" + sonido + "]";
	}

	public void emitir_sonido() {
		System.out.println("El sonido es ...");
	}
	
	public void horas_siesta(int horas) {
		System.out.println("La mascota duerme " + horas);
	}
}
