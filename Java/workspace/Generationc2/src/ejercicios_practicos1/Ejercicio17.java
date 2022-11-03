package ejercicios_practicos1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 17 *****");
		/*Escriba un programa que imprima los números impares entre dos extremos dados por el usuario
		y que además indique cuántos son.*/
		
		//creamos scanner
		Scanner usuario = new Scanner(System.in);
		
		//pedimos numeros
		System.out.println("Ingrese un numero");
		int numero1 = usuario.nextInt();
		System.out.println("Ingrese otro numero");
		int numero2  = usuario.nextInt();
		
		//llamamos funcion
		impares(numero1,numero2);
		
		//cerramos scanner
		usuario.close();
		
	}
	
	//funcion 
	static void impares (int numero1,int numero2) {
		
		//creamos arreglo impares
		ArrayList<Integer> impares = new ArrayList<Integer>(); //recuerda siempre colocar los parentesis al final
		
		//creamos if
		if(numero1 > numero2) { //numero1 mayor al numero2
			
			//creamos for
			for(int i = numero2;i <= numero1;i++) {
				
				//volcemos a crear if para solo colocar los impares
				if(i % 2 != 0) {
					
					//agregamos al arreglo
					impares.add(i);
					
				}
						
					
				}
			}else { //numero2 mayor al numero1
				
				//creamos for
				for(int i = numero1;i <= numero2;i++) {
					
					//volcemos a crear if para solo colocar los impares
					if(i % 2 != 0) {
						
						//agregamos al arreglo
						impares.add(i);
						
					}
			
				}
				
			}
		
		//imprimimos variable
		System.out.println(impares);
		
	}
	
}
