package ejercicios_practicos1;

import java.util.ArrayList;

public class Ejercicio19 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 19 *****");
		/*Escriba un programa que imprima los números del 1 al 100, que calcule la suma de todos los
		números pares y la suma de todos los impares.*/
		
		//llamamos funcion
		numeros();
		
	}
	
	//funcion 
	static void numeros () {
		
		
		//creamos variable numeros naturales
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		//creamos variables suma pares e impares
				int suma_pares = 0;
				int suma_impares = 0;
		
		//creamos for para agregarlos al arreglo
		for(int i = 1;i <= 100;i++) {
			
			//los metemos al arreglo
			numeros.add(i);
			
			//creamos if para ir sumando en cada caso
			if(i % 2 == 0) { //si es par
				
				//sumamos
				suma_pares = suma_pares + i;
				
			}else { //si es impar
				
				//sumamos
				suma_impares = suma_impares + i;
				
			}
			
		}
			
		//imprimimos variable
		System.out.println(numeros);
		
		//imprimimos suma
		System.out.println("La suma de los numeros pares es " + suma_pares);
		System.out.println("La suma de los numeros impares es " + suma_impares);
		
	}
	
}
