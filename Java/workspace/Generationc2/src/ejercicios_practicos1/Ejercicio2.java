package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 2 *****");
		/*Escriba un programa que permita calcular el área de un rectángulo. ¿Cómo modificaría su
		programa para que ahora calcule el área de un cuadrado de igual medida al ancho del
		rectángulo anterior?*/
		
		//crear scanner entrada de usuario
		Scanner usuario = new Scanner(System.in);
		
		//crear variables ancho y largo y pedirlos
		System.out.println("Ingrese largo");
		int largo = usuario.nextInt();
		System.out.println("Ingrese ancho");
		int ancho = usuario.nextInt();
		
		//llamar funcion
		area(largo,ancho);
		
		//cerrar scanner
		usuario.close();
	}
	
	//funcion que calcule area rectangulo y despues area cuadrado con ancho del rectangulo
	static void area(int medida_largo,int medida_ancho) {
		
		//area rectangulo
		int area_rectangulo = medida_largo * medida_ancho;
		System.out.println("El area del rectangulo es " + area_rectangulo);
		
		//area cuadrado
		int area_cuadrado = medida_ancho * medida_ancho;
		System.out.println("Si utilizamos el ancho del rectangulo para los lados de un cuadrado su area seria " + area_cuadrado);
		
	}
	
}
