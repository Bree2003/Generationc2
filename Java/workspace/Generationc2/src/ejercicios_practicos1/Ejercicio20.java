package ejercicios_practicos1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 20 *****");
		/*Escriba un programa que permita contar cuántos números múltiplos de 3 hay entre dos
		extremos dados por el usuario.*/
		
		//creamos scanner
		Scanner usuario = new Scanner(System.in);
		
		//pedimos numeros
		System.out.println("Ingrese un numero");
		int numero1 = usuario.nextInt();
		System.out.println("Ingrese otro numero");
		int numero2 = usuario.nextInt();
		
		//llamamos funcion
		multiplos(numero1,numero2);
		
		//cerramos scanner
		usuario.close();
		
	}
	
	//funcion 
	static void multiplos (int numero1,int numero2) {
		
		//creamos arreglo en donde guardamos los multiplos de 3
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		//if para saber desde que numero empezar
		if(numero1 < numero2) {
			
			//creamos for para recorrer cada numero entre numeros introducidos
			for(int i = numero1;i <= numero2;i++) {
				
				//volvemos a crear if para agregar multiplos
				if(i % 3 == 0) {
					
					//los agregamos al arreglo
					numeros.add(i);
					
				}
				
			}
			
		}else {
			
			//if para saber desde que numero empezar
			if(numero2 < numero1) {
				
				//creamos for para recorrer cada numero entre numeros introducidos
				for(int i = numero2;i <= numero1;i++) {
					
					//volvemos a crear if para agregar multiplos
					if(i % 3 == 0) {
						
						//los agregamos al arreglo
						numeros.add(i);
						
					}
					
				}
				
			}
			
		}
			
		//imprimimos variable
		System.out.println(numeros);
		//imprimos cantidad
		System.out.println("Cantidad de multiplos de 3: " + numeros.size()); //recuerda colocar size para saber el tamaño en arraylist
		
		
	}
	
}
