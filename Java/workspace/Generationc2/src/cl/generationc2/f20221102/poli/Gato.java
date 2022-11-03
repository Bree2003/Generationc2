package cl.generationc2.f20221102.poli;

public class Gato extends Mascotas{

	public Gato() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gato(String raza, String nombre, String sexo, String sonido) {
		super(raza, nombre, sexo, sonido);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void emitir_sonido() {
		System.out.println("El sonido es (maullido) miau");
	}

}
