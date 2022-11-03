package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio29 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 29 *****");
		/*Diseñe un programa que permita determinar si un numero es bisiesto o no; un año es bisiesto si
		es múltiplo de 4 excluyendo aquellos que son múltiplos de 100 y no de 400. En otras palabras,
		los años exactamente divisibles entre 4 son años bisiestos, los años exactamente divisibles entre
		100 no son bisiestos y los años exactamente divisibles entre 400 son bisiestos.*/
		
		//creamos scanner
		Scanner s = new Scanner(System.in);
		
		//pedimos numero
		System.out.println("Ingrese año");
		int año = s.nextInt();
		
		//llamamos funcion
		bisiesto(año);
		
		//cerramos scanner
		s.close();
	
	}
	
	//funcion 
	static void bisiesto (int año) {
		
		
		//bisiesto
		if(año % 4 == 0 && año % 100 != 0) {
			
			//imprimimos
			System.out.println("El año es bisiesto");                                                                                                                                                                                                                                                                
				
		}else if(año % 100 == 0 && año % 400 != 0) {
			
			//imprimimos
			System.out.println("El año no es bisiesto");                                                                                                                                                                                                                                                                
				
		}else if(año % 100 == 0 && año % 400 == 0) {
			
			//imprimimos
			System.out.println("El año es bisiesto");                                                                                                                                                                                                                                                                
				
		}else {
			
			//imprimimos
			System.out.println("El año no es bisiesto");
			
		}
			
	}
	
}
