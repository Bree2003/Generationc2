package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 6 *****");
		/*Escriba un programa que permita conocer el sueldo semanal de un trabajador en base a las
		horas que trabaja y el valor por hora ($H/H) que recibe.*/
		
		//creamos scanner
		Scanner usuario = new Scanner(System.in);
		
		//pedir horas trabajadas por dia y establecerlo en variable
		System.out.println("Horas trabajadas por dia");
		int horas = usuario.nextInt();
		//pedir valor por hora
		System.out.println("Valor por hora");
		int valor_hora = usuario.nextInt();
		//pedir dias trabajados
		System.out.println("Dias trabajados");
		int dias = usuario.nextInt();
		
		//llamar funcion
		sueldo_semanal(horas,valor_hora,dias);
		
		//cerramos scanner
		usuario.close();
		
	}
	
	//funcion calcular sueldo semanal
	static void sueldo_semanal(int hora, int valor, int dia) {
		
		//calcular sueldo diario
		int sueldo_diario = hora * valor;
		
		//calcular sueldo semanal
		int sueldo_semana = sueldo_diario * dia;
		
		//imprimir
		System.out.println("Tu sueldo semanal es de " + sueldo_semana + " pesos");
		
	}
	
}
