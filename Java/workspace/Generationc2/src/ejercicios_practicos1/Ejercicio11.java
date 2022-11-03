package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 11 *****");
		/*Escriba un programa que pida un número entero positivo de dos cifras por teclado y lo imprima
		en pantalla invertido.*/
		
		//creamos scanner
		Scanner usuario = new Scanner(System.in);
		
		//pedimos numero
		System.out.println("Ingrese un numero de mas de dos digitos");
		int numero = usuario.nextInt(); //es necesario si o si colocar el tipo de dato de la variable
		
		//llamamos funcion
		invertido(numero);
		
		//cerramos scanner
		usuario.close();
		
	}
	
	//funcion invertir numero
	static void invertido (int numero) {
		
		//creamos numero invertido variable
		int numero_invertido = 0;
		
		//creamos while para repetir la accion
		while(numero > 0) {
			
			//primero separamos numero con resto %10
			int resto = numero % 10;
			
			//ese resto lo sumamos y multiplicamos por diez para dejar espacio para el otro numero
			numero_invertido = (numero_invertido * 10) + resto;
			
			//definimos de nuevo el numero sin el decimal
			numero = (int) (numero / 10);
		
		}
		
		//imprimimos
		System.out.println("El numero invertido seria " + numero_invertido);
		
	}
	
}
