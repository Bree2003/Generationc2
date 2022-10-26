package cl.generationc2.f20221026;

import java.util.Scanner;

public class BucleDoWhileTest {

	public static void main(String[] args) {
		// metodo dowhile
		//a lo menos se ejecuta una vez
		
		Scanner sc = new Scanner(System.in); 
		int edad = 0;
		
		do {
			System.out.println("Ingresa tu edad");
			edad = sc.nextInt(); //lo escribes en la consola
			
		} while (edad < 18 || edad > 120); //se repite hsta que se cumpla la condicion
		
		//kilos
		
		Float kilos = 0f;
		
		do {
			System.out.println("Ingresa tu peso");
			kilos = sc.nextFloat(); //lo escribes en la consola
			
		} while (kilos < 40 || kilos > 200); //se repite hsta que se cumpla la condicion
		
		System.out.println("peso ingresado " + kilos);
		
		//estatura
		
		Float estatura = 0f;
		
		do {
			System.out.println("Ingresa tu estatura");
			estatura = sc.nextFloat(); //lo escribes en la consola
			
		} while (estatura < 0.8 || estatura > 3.00); //se repite hsta que se cumpla la condicion
		
		System.out.println("estatura ingresado " + estatura);
		sc.close();

	}

}
