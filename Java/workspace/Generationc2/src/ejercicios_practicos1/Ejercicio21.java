package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio21 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 21 *****");
		/*Escriba un programa que calcule el factorial de un número.*/
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//pedimos numero
		System.out.println("Ingrese un numero");
		int numero = sc.nextInt();
		
		//llamamos funcion
		factorial(numero);
		
		//cerramos scanner
		sc.close();
	}
	
	//funcion 
	static void factorial (int numero) {
		
		//creamos variable
		int factorial = 1; //cero para suma y uno para multiplicacion
		
		//creamos for
		for(int i = numero;i > 0;i--) {
		
			//calculamos
			factorial = factorial * i;
		}
		
		//imprimimos
		System.out.println("EL factorial del numero es " + factorial);		
		
	}
	
}
