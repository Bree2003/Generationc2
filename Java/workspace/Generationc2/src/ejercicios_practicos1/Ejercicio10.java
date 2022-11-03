package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		System.out.println("***** Ejercicio 10 *****");
		/*Escriba un algoritmo que permita determinar cuánto dinero ahorra una persona en un año si
		considera que cada semana ahorra 15% de su sueldo.*/
		
		//creamos scanner
		Scanner usuario = new Scanner(System.in);
		
		//pedimos sueldo
		System.out.println("Ingrese sueldo");
		int sueldo = usuario.nextInt();
		
		//variable descuento 15% sueldo
		int descuento = (int) (sueldo * 0.15);
		
		//semanas en un año
		int semanas = 4 * 12;
		
		//variable ahorro
		int ahorro = 0;
		
		//bucle
		for(int i = 0;i < semanas;i++) {
			
			//total ahorro
			ahorro = ahorro + descuento;
			
		}
		
		//imprimimos
		System.out.println("En un año tendrias ahorrado " + ahorro + " si cada semana ahorras un 15% de tu sueldo");
		
		//cerramos scanner
		usuario.close();
		
	}

}
