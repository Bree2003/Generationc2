package cl.generationc2.f20221102.interfaces;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// interfaces y clases abstractas

				//no se pueden instanciar clases abstractas
				//Animal animal = new Animal();
				
				Leon leon = new Leon();
				leon.setAltura(0.80f);
				leon.setPeso(200f);
				leon.comer();
				System.out.println(leon);
				leon.metodoEnAnimal();
				//Persona persona = new Persona();
				
	}

}
