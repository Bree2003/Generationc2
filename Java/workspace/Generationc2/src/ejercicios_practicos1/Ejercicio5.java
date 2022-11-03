package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 5 *****");
		//Escriba un programa que solicite al usuario 4 notas y calcule su promedio.
		
		//creamos scanner
		Scanner usuario = new Scanner(System.in);
		
		//pedimos notas y las metemos en variables
		System.out.println("Ingrese primera nota");
		float nota1 = usuario.nextFloat();
		System.out.println("Ingrese segunda nota");
		float nota2 = usuario.nextFloat();
		System.out.println("Ingrese tercera nota");
		float nota3 = usuario.nextFloat();
		System.out.println("Ingrese cuarta nota");
		float nota4 = usuario.nextFloat(); 
		
		//recuerda que en la consola los decimales se ingresan con coma, en el codigo con punto
		
		//llamar funcion
		promedio_nota(nota1,nota2,nota3,nota4);
		
		//cerramos scanner
		usuario.close();
		
	}
	
	//creamos funcion promedio
	static void promedio_nota(float primera_nota,float segunda_nota,float tercera_nota,float cuarta_nota) {
		
		//definimos suma
		float suma = primera_nota + segunda_nota + tercera_nota + cuarta_nota;
		
		//definimos promedio
		float promedio = suma / 4;
		
		//imprimimos
		System.out.println("Tu promedio es " + promedio);
	}
	
}
