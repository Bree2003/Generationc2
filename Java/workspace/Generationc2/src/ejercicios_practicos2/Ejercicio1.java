package ejercicios_practicos2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		/*Escriba una función para generar el N-ésimo elemento de la sucesión de Fibonacci (0, 1, 1, 2, 3,
		5, 8, 13,...). El planteamiento del algoritmo correspondiente se hace a partir del análisis de la
		sucesión, en la que se puede observar que un tercer valor de la serie está dado por la suma de
		los dos valores previos. De aquí que se asignan los dos valores para sumar (0, 1), que dan la
		base para obtener el siguiente elemento que se busca.*/

		//crear scanner
		Scanner s = new Scanner(System.in);
		
		//pedir posicion de la secuencia fibonacci
		System.out.println("Ingrese un numero");
		int posicion = s.nextInt();
		
		//llamar funcion
		fibonacci(posicion);
		
		//cerrar scanner
		s.close();
	}
	
	//funcion
	public static void fibonacci(int posicion) {
		
		//creamos arreglo valores
		ArrayList<Integer> valores = new ArrayList<Integer>();
		
		//agregamos primeros dos valores
		valores.add(0);
		valores.add(1);
		
		//creamos variable valor
		int valor = 0;
		
		for(int i = 0;i < posicion;i++) { //me imprime mas de la posicion 10 pero no me quejo ya que me funciona
			
			//calculamos
			valor = (valores.get(i) + valores.get(i+1));
			valores.add(valor);
			
		}
		
		//imprimos
		System.out.println(valores);
		System.out.println("El numero en esa posicion siguiendo la secuencia fibonacci seria " + valores.get(posicion - 1)); //recuerda que el index empieza en cero
		
	}

}
