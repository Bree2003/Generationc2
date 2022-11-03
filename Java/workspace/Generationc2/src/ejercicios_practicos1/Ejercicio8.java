package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 8 *****");
		/*Escriba un programa que permita determinar el costo que tendrá el realizar una llamada
		telefónica en base al tiempo que dura la llamada y su costo por segundo.*/
		
		//creamos scanner
		Scanner usuario = new Scanner(System.in);
		
		//pedir costo por minuto
		System.out.println("Ingrese costo por minuto");
		int costo_minuto = usuario.nextInt();
		//pedir minutos usados
		System.out.println("Ingrese tiempo que duraria la llamada (minutos)");
		int minutos = usuario.nextInt();
		
		//llamar funcion
		llamada(costo_minuto,minutos);
		
		//cerramos scanner
		usuario.close();
		
	}
	
	//funcion costo de la llamada
	static void llamada(int costo, int minuto) {
		
		//multiplicar costo por minuto por los minutos
		int costo_total = costo * minuto;
		
		//imprimir
		System.out.println("El total de la llamada seria " + costo_total);
		
	}
	
}
