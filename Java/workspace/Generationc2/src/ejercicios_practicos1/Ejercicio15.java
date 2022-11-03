package ejercicios_practicos1;

import java.util.ArrayList;

public class Ejercicio15 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 15 *****");
		/*Escriba un programa que imprima todos los números pares entre 0 y 100.*/
		
		//llamamos funcion
		pares();
		
	}
	
	//funcion 
	static void pares () {
		
		//creamos variable donde meteremos los valores
		//int[] numeros = new int[51]; //colocamos tamaño del arreglo en 50 al ser la mitad de los numeros
		//no nos sirve lo de arriva
		ArrayList<Integer> numeros = new ArrayList<Integer>(); //recuerda colocar los parentesis al final
		
		//creamos for
		for(int i = 0;i <= 100;i++) {
			
			
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
