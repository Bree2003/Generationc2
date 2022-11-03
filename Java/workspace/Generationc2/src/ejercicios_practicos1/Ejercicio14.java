package ejercicios_practicos1;

import java.util.ArrayList;

public class Ejercicio14 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 14 *****");
		/*Escriba un programa que imprima los números del 100 al 1 de dos en dos.*/
		
		//llamamos funcion
		dos_en_dos();
		
	}
	
	//funcion 
	static void dos_en_dos () {
		
		//creamos variable donde meteremos los valores
		//int[] numeros = new int[51]; //colocamos tamaño del arreglo en 50 al ser la mitad de los numeros
		//no nos sirve lo de arriva
		ArrayList<Integer> numeros = new ArrayList<Integer>(); //recuerda colocar los parentesis al final
		
		//creamos for
		for(int i = 100;i > 0;i--) {
			
			
			//creamos if para colocar solo numeros pares
			if(i % 2 ==0) {
				
				//colocamos los numeros en el arreglo
				numeros.add(i);
				
			}
			
		}
		
		//imprimimos arreglo
		System.out.println(numeros);
		
	}
	
}
