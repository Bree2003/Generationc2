package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 12 *****");
		/*Escriba un programa que imprima en pantalla si un número dado por teclado es positivo,
		negativo o cero.*/
		
		//creamos scanner
		Scanner usuario = new Scanner(System.in);
		
		//pedimos numero
		System.out.println("Ingrese un numero");
		int numero = usuario.nextInt(); //es necesario si o si colocar el tipo de dato de la variable
		
		//llamamos funcion
		signo(numero);
		
		//cerramos scanner
		usuario.close();
		
	}
	
	//funcion signo numero
	static void signo (int numero) {
		
		//creamos if 
		if(numero > 0) { //positivo
			
			//imprimimos
			System.out.println("El numero es positivo");
			
		}else if(numero < 0) { // negativo
			
			//imprimimos
			System.out.println("El numero es negativo");
			
		}else if(numero == 0) {//igual a cero
			
			//imprimimos
			System.out.println("El numero es cero");
			
		}
		
	}
	
}
