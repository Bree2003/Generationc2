package ejercicios_practicos1;

public class Ejercicio16 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 16 *****");
		/*Escriba un programa que imprima la suma de los 100 primeros números naturales.*/
		
		//llamamos funcion
		suma();
		
	}
	
	//funcion 
	static void suma () {
		
		//creamos variable suma numeros naturales
		int suma_numeros = 0; //recuerda colocar tipo de dato al declarar una variable
		
		//creamos for
		for(int i = 1;i <= 100;i++) {
			
			//hacemos la sumatoria
			suma_numeros = suma_numeros + i;
			
		}
		
		//imprimimos variable
		System.out.println(suma_numeros);
		
	}
	
}
