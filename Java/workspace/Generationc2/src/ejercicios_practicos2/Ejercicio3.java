package ejercicios_practicos2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		/*Escriba una función que permita verificar un RUT. Para ello, se realiza el siguiente
		procedimiento:
		• Invertir el orden del rut
		• Tome los números y vaya multiplicando cada uno de ellos por la siguiente serie de números:
		2, 3, 4, 5, 6, 7... en ese orden. Si se le acaban los números de la serie, vuelva a usarla desde
		el principio.
		• Una vez que haya multiplicado cada uno de los números, sume los resultados obtenidos.
		• Divida el número obtenido por 11 y obtenga el resto..
		• Al número 11, réstele el resto de la división anterior.
		• Si el número obtenido es 11, el dígito verificador es 0. Si el número obtenido es 10, el dígito
		verificador es K.*/
		
		System.out.println("***** Ejercicio 3 *****");
		
		//crear scanner
		Scanner s = new Scanner(System.in);
		
		//pedir rut
		System.out.println("Ingrese rut sin digito verificador");
		int rut = s.nextInt();
		System.out.println("Ingrese digito verificador");
		int digito = s.nextInt();
		
		//llamamos programa
		verificador(rut,digito);
		
		//cerrar scanner
		s.close();

	}
	
	//creamos programa
	public static void verificador(int rut,int digito) {
		
		//creamos variable numero al reves
		int rut_invertido = 0;
		
		while(rut > 0) {
			
			
			
		}
		
		
		
	}

}
