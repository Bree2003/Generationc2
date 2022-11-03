package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio28 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 28 *****");
		/*Cierta empresa proporciona un bono mensual a sus trabajadores, el cual puede ser por su
		antigüedad o bien por el monto de su sueldo (el que sea mayor), de la siguiente forma:
		Cuando la antigüedad es mayor a 2 años pero menor a 5, se otorga 20 % de su sueldo; cuando
		es de 5 años o más, 30 %. Ahora bien, el bono por concepto de sueldo, si éste es menor a
		$1000, se da 25 % de éste, cuando éste es mayor a $1000, pero menor o igual a $3500, se
		otorga 15% de su sueldo, para más de $3500. 10%. Escriba un programa que permita calcular
		los dos tipos de bono, asignando el mayor.*/
		
		//creamos scanner
		Scanner s = new Scanner(System.in);
		
		//pedimos numero
		System.out.println("Ingrese sueldo en dolares");
		int sueldo = s.nextInt();
		System.out.println("Ingrese años en la empresa");
		int años = s.nextInt();
	
		//llamamos funcion
		empresa(sueldo, años);
		
		//cerramos scanner
		s.close();
	
	}
	
	//funcion 
	static void empresa (int sueldo,int años) {
		
		//variable tipo de bonos
		int antiguedad = 0;
		int concepto_sueldo = 0;
		
		//bono antiguedad
		if(años > 2 && años < 5) {
			
			//calculamos
			antiguedad = (int) (sueldo * 0.2);
			
		}else if(años >= 5) {
			
			//calculamos
			antiguedad = (int) (sueldo * 0.3);
			
		}
		
		//bono concepto de sueldo
		if(sueldo < 1000) {
			
			//calculamos
			concepto_sueldo = (int) (sueldo * 0.25);
			
		}else if(sueldo > 1000 && sueldo <= 3500) {
			
			//calculamos
			concepto_sueldo = (int) (sueldo *0.15);
			
		}else if(sueldo > 3500) {
			
			//calculamos
			concepto_sueldo = (int) (sueldo * 0.1);
			
		}
		
		//verificamos cual es mayor
		if(antiguedad < concepto_sueldo) {
			
			//imprimimos
			System.out.println("Su bono corresponde a un total de " + concepto_sueldo + " por concepto de sueldo");
			
		}else {
			
			//imprimimos
			System.out.println("Su bono corresponde a un total de " + antiguedad + " por antiguedad");
			
	}
		
	}
	
}
