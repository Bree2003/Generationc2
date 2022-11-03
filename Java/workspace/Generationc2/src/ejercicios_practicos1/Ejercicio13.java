package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 13 *****");
		/*Escriba un programa que lea un número del teclado e imprima en pantalla si es par o impar.*/
		
		//creamos scanner
		Scanner usuario = new Scanner(System.in);
		
		//pedimos numero
		System.out.println("Ingrese un numero");
		int numero = usuario.nextInt(); //es necesario si o si colocar el tipo de dato de la variable
		
		//llamamos funcion
		par_o_impar(numero);
		
		//cerramos scanner
		usuario.close();
		
	}
	
	//funcion signo numero
	static void par_o_impar (int numero) {
		
		//creamos variable resto 
		int resto = numero % 2;
		
		//creamos if
		if(resto == 0) { //par
			
			//imprimimos
			System.out.println("El numero es par");
			
		}else {//impar
			
			//imprimimos
			System.out.println("El numero es impar");
			
		}
		
	}
	
}
