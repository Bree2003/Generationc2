package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio32 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 32 *****");
		/*Suponga que tiene un tienda y desea registrar sus ventas por medio de una computadora.
		Escriba un programa que lea por cada cliente:
		• El monto de la venta
		• Calcule e imprima el IVA
		• Calcule e imprima el total a pagar
		• Lea la cantidad con que paga el cliente
		• Calcule e imprima el cambio
		Al final del día deberá imprimir la cantidad de dinero que debe haber en la caja.*/
		
		//crear scanner
		Scanner s = new Scanner(System.in);
		
		//pedir opcion
		int opciones = 0;
		
		//crear variable total dia
		int total_dia = 0;		
		
		do {
			
			
			//crear menu
			System.out.println("Ingrese (1) para ingresar nuevo cliente o (2) para cerrar caja");
				
			//pedir opcion
			opciones = s.nextInt();
			
			switch(opciones) {
			
			case 1:
					
			//ingresar monto de la compra
			System.out.println("Ingrese monto de la compra");
			int monto_compra = s.nextInt();
					
			//calcular iva
			int IVA = (int) (monto_compra * 0.19);
			System.out.println("El IVA es de " + IVA);
					
			//total a pagar
			int total_pagar = monto_compra + IVA;
			System.out.println("Total a pagar " + total_pagar);
					
			//monto dado
			System.out.println("Ingrese con que cantidad desea pagar");
			int cantidad = s.nextInt();
					
			//cambio a dar
			int cambio = cantidad - total_pagar;
			System.out.println("Su cambio es de " + cambio);
					
			//sumarlo al total dia
			total_dia = total_dia + total_pagar;
				
			break;
				
			case 2:
					
			//cerrar caja
			System.out.println("Usted ha cerrado la caja");
			System.out.println("Cantidad de dinero en caja " + total_dia);
				
			break;
				
			default:
			System.out.println("Opcion ingresada no valida, vuelva a ingresar una opcion");
				
		}
			
		}while(opciones == 1 || opciones < 1 || opciones > 2);
		
		//cerrar scanner
		s.close();
	}
	
}
