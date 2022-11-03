package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 1 *****");
		/*Escriba un programa que solicite a un usuario dos números por teclado y calcule su suma, resta,
		producto y división.*/
		
		//solicitar numero al usuario
		Scanner usuario = new Scanner(System.in); //System.in->solicita entrada del usuario
		
		//crear variable con el tipo de dato
		//numero1 = new int;->asi no se hace ovbiamente jsjsj
		//int numero1 = new int;->asi tampoco :(
		System.out.println("Ingrese primer numero");
		int numero1 = usuario.nextInt(); //nexInt()->obtener entrada tipo numero
		System.out.println("Ingrese segundo numero");
		int numero2 = usuario.nextInt();
				
		//imprimir resultados
		System.out.println("Primer numero " + numero1);
		System.out.println("Segundo numero " + numero2);
		operatoria(numero1,numero2);//->si lo coloco asi nomas no imprime nada
		//si imprime, se me olvido ingresar los numeros jsjsj
		//System.out.println(operatoria(numero1,numero2));->no imprime
		
		
		
		usuario.close();
		
	}
	
	//funcion para calcular suma, resta, multiplicacion y division entre dos numeros
	/*static void funcion(primer_numero,segundo_numero) { //recuerda colocar tipo de dato a los parametros ahhhh
		
	}*/
	static void operatoria(int primer_numero,int segundo_numero) {
		
		//suma
		int suma = primer_numero + segundo_numero;
		System.out.println("Suma " + suma);
		
		//resta
		int resta = primer_numero - segundo_numero;
		System.out.println("Resta " + resta);
		
		//multiplicacion
		int multiplicacion = primer_numero * segundo_numero;
		System.out.println("Multiplicacion " + multiplicacion);
		
		//division
		int division = primer_numero / segundo_numero;
		System.out.println("Division " + division);
	}
	
}
