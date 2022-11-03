package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 4 *****");
		/*Escriba un algoritmo que permita calcular la edad de una persona según su año de
		nacimiento.*/
		
		//creamos scanner
		Scanner usuario = new Scanner(System.in);
		
		//pedir año de nacimiento y crear variable
		System.out.println("Introduce tu año de nacimiento");
		int nacimiento = usuario.nextInt();
		
		//calcular edad
		//creamos variable año actual->no lo pille asi que vamos a hacer que el usuario ingrese año actual
		System.out.println("Ingrese año actual");
		int año_actual = usuario.nextInt();
		
		//creamos variable edad
		int edad = 0;
		
		//creamos algoritmo
		for(int i = nacimiento;i < año_actual;i++) {
			
			//calculamos edad
			
			edad++;
		}
		
		System.out.println("Tienes aproximadamente " + edad + " años");
		
		//cerramos scanner
		usuario.close();
		
	}
	
}
