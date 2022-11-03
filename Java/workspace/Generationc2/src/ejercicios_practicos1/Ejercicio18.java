package ejercicios_practicos1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 18 *****");
		/*Escriba un programa que imprima todos los números naturales entre dos extremos dados por el
		usuario, con un salto también indicado por el usuario.*/
		
		//creamos scanner
		Scanner usuario = new Scanner(System.in);
		
		//pedimos numeros
		System.out.println("Ingrese un numero");
		int numero1 = usuario.nextInt();
		System.out.println("Ingrese otro numero");
		int numero2  = usuario.nextInt();
		
		//pedimos numero saltado->decidi hacerlo asi para no joderme la cabeza
		System.out.println("Ingrese numero a saltar");
		int salto = usuario.nextInt();
		
		//llamamos funcion
		numeros(numero1,numero2,salto);
		
		//cerramos scanner
		usuario.close();
		
	}
	
	//funcion 
	static void numeros (int numero1,int numero2, int salto) {
		
		//creamos arreglo para meter los valores
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		//creamos if para saber que numero es mayor
		if(numero1 < numero2) {
			
			//creamos for
			for(int i = numero1; i <= numero2;i++) {
				
				//volvemos a crear if para saltar numero deseado
				if(i != salto) {
					
					//lo metemos al arreglo
					numeros.add(i);
					
				}
			}
			
		}else { //caso contrario
			
			//creamos for
			for(int i = numero2; i <= numero1;i++) {
				
				//volvemos a crear if para saltar numero deseado
				if(i != salto) {
					
					//lo metemos al arreglo
					numeros.add(i);
					
				}
			}
			
		}
		
		//imprimimos variable
		System.out.println(numeros);
		
	}
	
}
