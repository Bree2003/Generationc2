package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 27 *****");
		/*El dueño de un estacionamiento le pide que escriba un programa que le permita determinar
		cuánto debe cobrar por el uso del estacionamiento a sus clientes. Las tarifas que se tienen son
		las siguientes: las dos primeras horas a $500 c/u; las siguientes tres a $400 c/u; las cinco
		siguientes a $300 c/u y después de diez horas el costo por cada una es de $200.*/
		
		//creamos scanner
		Scanner s = new Scanner(System.in);
		
		//pedimos numero
		System.out.println("Ingrese costo de materia prima");
		int horas = s.nextInt();
	
		//llamamos funcion
		estacionamiento(horas);
		
		//cerramos scanner
		s.close();
	
	}
	
	//funcion 
	static void estacionamiento (int horas) {
		
		//creamos contador horas
		int contador = 1;
		
		//creamos variable cobro
		int cobro = 0;
		
		//creamos while
		while(contador <= horas) {
			
			//dos primeras horas
			if(contador <= 2) {
				
				//calculamos
				cobro = cobro + 500;

			}
			
			//siguientes tres horas
			if(contador > 2 && contador <= 5) {
				
				//calculamos
				cobro = cobro + 400;
				
			}
			
			//las cinco siguientes horas
			if(contador > 5 && contador <= 10) {
				
				//calculamos
				cobro = cobro + 300;
				
			}
			
			//despues de las diez horas
			if(contador > 10) {
				
				//calculamos
				cobro = cobro +200; 
				
			}
			
			//aumentamos contador
			contador++;
		}
				
		//imprimimos
		System.out.println("En total seria " + cobro);
		
	}
	
}
