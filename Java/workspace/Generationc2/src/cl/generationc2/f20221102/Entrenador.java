package cl.generationc2.f20221102;

public class Entrenador extends Equipo_basquetball{

	private int anos_experiencia;
	private String equipo;
	
	public Entrenador() {
		super();
	}
	
	public Entrenador(int anos_experiencia, String equipo) {
		super();
		this.anos_experiencia = anos_experiencia;
		this.equipo = equipo;
	}

	public int getAnos_experiencia() {
		return anos_experiencia;
	}

	public void setAnos_experiencia(int anos_experiencia) {
		this.anos_experiencia = anos_experiencia;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Entrenador [anos_experiencia=" + anos_experiencia + ", equipo=" + equipo + ", getNombre()="
				+ getNombre() + ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}

	public void metodoImprimir() {
		System.out.println("Estoy en el metodo de la super clase entrenador");
	}
	

	
}
