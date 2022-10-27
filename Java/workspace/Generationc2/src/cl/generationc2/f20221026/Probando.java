package cl.generationc2.f20221026;

import java.util.Scanner;

public class Probando {


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int edad = 0; //en algunso casos la variable va afuera del loop para que tenga un contexto globa.
		Float kilos = 0f;
		Float estatura = 0f;
		//Float IMC = kilos / (estatura * estatura);-> da 0/0 por lo tanto no da
		
		
		//SOLICITAR NOMBRE Y APELLIDO. GENERAR UN MENSAJE QUE DIGA: EL PACIENTE X,X DE EDAD Y, DE ESTATURA Z, DE PESO V ESTÁ CON SOBREPESO.
		
		System.out.println("Ingrese su nombre: ");
		String nombre = scanner.next();
		
		System.out.println("Ingrese su apellido paterno: ");
		String apellidoPaterno = scanner.next();
		
		System.out.println("Ingrese su apellido materno: ");
		String apellidoMaterno = scanner.next();
		
		do {
			System.out.println("Ingrese su edad");
			edad = scanner.nextInt(); //scaneamos una variable de tipo int ya que lo asociamos a la variable que está fuera del dowhile.
			
		} while (edad < 18 || edad > 120); //mientras la condición sea verdadera, el ciclo se repetirá infinitas veces.
		
		
		
		//
		do {
			System.out.println("Ingrese su peso");
			kilos = scanner.nextFloat();
			
		} while (kilos < 40 || kilos >300);
		
		
		
		do {
			System.out.println("Ingrese su estatura");
			estatura = scanner.nextFloat();
			
		} while (estatura < 1.01 || estatura >3.00);
		Float IMC = kilos / (estatura * estatura); // despues de todos los datos establecidos se hace la operatoria
		
		if(IMC < 18.5f) {
			System.out.println(nombre+ " "+apellidoPaterno+" "+apellidoMaterno+ " de "+edad+" años de edad, con una estatura de "+estatura+" con un IMC de"+IMC+" se encuentra bajo peso");
			
		} else if(IMC >= 18.5f && IMC < 25){
			System.out.println(nombre+ " "+apellidoPaterno+" "+apellidoMaterno+ " de "+edad+" años de edad, con una estatura de "+estatura+" con un IMC de"+IMC+" se encuentra en un peso normal");
			
		} else if(IMC >= 25 && IMC < 30) {
			System.out.println(nombre+ " "+apellidoPaterno+" "+apellidoMaterno+ " de "+edad+" años de edad, con una estatura de "+estatura+" con un IMC de "+IMC+" se encuentra sobre peso");
			
			
		} else {
			System.out.println(IMC);
		
			System.out.println(nombre+ " "+apellidoPaterno+" "+apellidoMaterno+ " de "+edad+" años de edad, con una estatura de "+estatura+" con un IMC de"+IMC+" se encuentra obeso");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		scanner.close();
	}
	
}


