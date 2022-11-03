package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio24 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 24 *****");
		/*Escriba un programa que solicite al usuario por teclado entre 1 y 10 e imprima su tabla de
		multiplicar.*/
		
		//creamos scanner
		Scanner s = new Scanner(System.in);
		
		//pedimos numero
		System.out.println("Ingrese un numero entre 1 y 10");
		int numero = s.nextInt();
	
		//llamamos funcion
		tabla(numero);
		
		//cerramos scanner
		s.close();
	
	}
	
	//funcion 
	static void tabla (int numero) {
		
		//creamos if
		if(numero < 1 || numero > 10) {
			
			//imprimimos
			System.out.println("EL numero que ingresaste no esta en el rango que te dijimos");
			
		}else {
			
			//creamos for
			for(int i = 1;i <= 10;i++) {
				
				//imprimimos
				System.out.println(numero + " * " + i + " = " + numero * i);
				
			}
			
		}
		
	}
	
}
