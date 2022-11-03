package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 3 *****");
		/*Escriba un programa que, dada una cantidad de dinero en pesos chilenos ingresada por
		teclado, calcule la cantidad de dólares que se pueden comprar.*/
		
		//crear entrada de usuario
		Scanner usuario = new Scanner(System.in);
		
		//crear variable pesos chilenos y pedirlo
		System.out.println("Ingrese cantidad de dinero en pesos chilenos");
		int pesos_chilenos = usuario.nextInt();
		
		//llamar funcion
		//dolares(pesos_chilenos); //obvio que no me va a funcionar porque asi no se llama la funcion
		conversion(pesos_chilenos);
		
		//cerrar scanner
		usuario.close();
		
	}
	
	//crear funcion convertir pesos chilenos a dolares
	static void conversion(int moneda) {
		
		//convertir moneda
		double dolares = moneda / 943.00;
		System.out.println("En total serian " + dolares + " dolares");
		
	}
	
}
