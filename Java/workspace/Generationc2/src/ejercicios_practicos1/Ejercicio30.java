package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio30 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 30 *****");
		/*Diseñe un programa que calcule el costo total de una hospitalización sabiendo el total de días
		y el costo de la habitación. El costo de la habitación viene dado por la siguiente tabla:
		*Area 1 Costo 150000
		*Area 2 Costo 120000
		*Area 3 Costo 200000
		*Otra Costo 80000*/
		
		//creamos scanner
		Scanner s = new Scanner(System.in);
		
		//areas
		System.out.println("1.-Area 1");
		System.out.println("2.-Area 2");
		System.out.println("3.-Area 3");
		System.out.println("0.-Otra Area");
		
		//pedimos numero
		System.out.println("Ingrese area (Opcion 1, 2, 3 o 0)");
		int area = s.nextInt();
		System.out.println("ingrese dias");
		int dias = s.nextInt();
		
		//llamamos funcion
		hospitalizacion(area,dias);
		
		//cerramos scanner
		s.close();
	
	}
	
	//funcion 
	static void hospitalizacion (int area,int dias) {
		
		//creamos variable costo (multipicacion igual a uno, aunque en este caso no afecta)
		int costo = 1;
		
		//definimos areas
		if(area == 1) {
			
			//calculamos
			costo = dias * 150000;
			
		}else if(area == 2) {
			
			//calculamos
			
			costo = dias * 120000;
			
		}else if(area ==3) {
			
			//calculamos
			costo = dias * 200000;
			
		}else if(area == 0) {
			
			//calculamos
			costo = dias * 80000;
		}
		
		//imprimimos
		System.out.println("Para un total de " + dias + " dias, el costo es de " + costo);
	}
	
}
