package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 22 *****");
		/*Escriba un programa que calcule la potencia entera positiva de un número dado por teclado.*/
		//estan mas malas las redacciones, voy a pedir un numero y otro que seria el elevado
		
		//creamos scanner
		Scanner sc = new Scanner(System.in);
		
		//pedimos numero
		System.out.println("Ingrese un numero");
		int numero1 = sc.nextInt();
		System.out.println("Elevado a");
		int numero2 = sc.nextInt();
		
		//llamamos funcion
		potencia(numero1,numero2);
		
		//cerramos scanner
		sc.close();
	}
	
	//funcion 
	static void potencia (int numero1,int numero2) {
		
		//creamos variable
		int potencia = 1; //cero para suma y uno para multiplicacion
		
		//creamos for
		for(int i = 0;i < numero2;i++) { //recuerda ver bien si es menor o mayor
		
			//calculamos
			potencia = potencia * numero1;
		}
		
		//imprimimos
		System.out.println("La potencia del numero es " + potencia);		
		
	}
	
}
