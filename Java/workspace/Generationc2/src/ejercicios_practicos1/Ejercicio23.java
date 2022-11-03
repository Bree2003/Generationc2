package ejercicios_practicos1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio23 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 23 *****");
		/*Escriba un programa que determine si un número dado por teclado es o no primo.*/
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//pedimos numero
		System.out.println("Ingrese un numero");
		int numero1 = sc.nextInt();
		
		//llamamos funcion
		primo(numero1);
		
		//cerramos scanner
		sc.close();
	}
	
	//funcion 
	static void primo (int numero1) {
		
		//creamos variable
		ArrayList<Integer> divisores = new ArrayList<Integer>();
		
		//creamos for
		for(int i = 2;i < numero1;i++) {
			
			//creamos if
			if(numero1 % i == 0) { //si es divisible por esos numeros
				
				//agregamos a la variable
				divisores.add(i);
				
			}
			
		}
		
		//creamos if
		if(divisores.size() > 0) {
			
			//imprimimos
			System.out.println("El numero no es primo");
			
		}else {
			
			//imprimimos
			System.out.println("El numero es primo");
			
		}
		
	}
	
}
