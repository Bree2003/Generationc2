package cl.generationc2.f20221102.poli;

public class Polimain {

	public static void main(String[] args) {
		// Polimorfismo
		//una clase se comporta como otra pero no es la otra
		
		//para que exista primero debe existir herencia, jerarquia de clases
		
		//instancia de las clases
		Mascotas mascota = new Mascotas(); //constructor vacio, no se meten parametros
		mascota.emitir_sonido();
		
		Perro perro = new Perro();
		perro.emitir_sonido();

		Gato gato = new Gato();
		gato.emitir_sonido();
		
		/****************************/
		
		Mascotas regalon = new Perro(); //se comporta como un perro pero no es un perro
		regalon.emitir_sonido();
		
		
		Mascotas michi = new Gato(); //no es un gato
		michi.emitir_sonido();

	}

}
