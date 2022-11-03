package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 7 *****");
		/*Escriba un programa que permita determinar cuánto cobra un pintor por pintar una cantidad
		dada de metros cuadrados, a partir del costo ingresado por el usuario.*/
		
		//creamos scanner
		Scanner usuario = new Scanner(System.in);
		
		//en mi defensa no esta bien redactado o yo no entiendo
		//pedimos costo por metro cuadrado
		System.out.println("Ingrese costo por metro cuadrado");
		int costo = usuario.nextInt();
		//pedimos metros cuadrados
		System.out.println("Ingrese metros cuadrados");
		int metro_cuadrado = usuario.nextInt();
		
		//llamamos funcion
		cobro_total(costo,metro_cuadrado);
		
		//cerramos scanner
		usuario.close();
		
	}
	
	//cobro por metro cuadrado pintado
	static void cobro_total(int precio,int metro) {
		
		//multiplicar costo por metro cuadrado
		int cobro = precio * metro;
		
		//imprimir
		System.out.println("El total a cobrar sera " + cobro);
	}
	
}
