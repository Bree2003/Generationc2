package cl.generationc2.f20221102;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Herencia en Java
		
		//instanciando objetos 
		Entrenador entrenador = new Entrenador();
		entrenador.setNombre("Jhon");
		entrenador.setApellido("Doe");
		entrenador.setEdad(55);
		entrenador.setAnos_experiencia(10);
		entrenador.setEquipo("Valdivia");
		
		//System.out.println(entrenador.toString());
		
		Kinesiologo kine = new Kinesiologo();
		kine.setNombre("Jane");
		kine.setApellido("Doe");
		kine.setEdad(52);
		kine.setTitulo("KInesiologia");
		kine.setEspecialidad("EN musculos");
		
		ArrayList<Basquetbolista> listaJugadores = new ArrayList<Basquetbolista>();
		
		Basquetbolista basque = new Basquetbolista();
		basque.setNombre("Michel");
		basque.setApellido("Pipen");
		basque.setAltura(2.15f);
		
		listaJugadores.add(basque); //agregando un objeto a la lista

		Basquetbolista basque2 = new Basquetbolista();
		basque2.setNombre("Steve");
		basque2.setApellido("Curry");
		basque2.setAltura(2.5f);
		
		listaJugadores.add(basque2);
		
		//recorrer lista
		for (Basquetbolista jugador:listaJugadores) {
			System.out.println(jugador);
		}
		
		System.out.println(listaJugadores);
		
	
	}

}
