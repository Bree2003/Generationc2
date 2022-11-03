package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 9 *****");
		/*Escriba un algoritmo que permita para determinar cuánto pagará finalmente una persona por
		un artículo, considerando que tiene un descuento de 20%, y debe pagar 15% de IVA.*/
		
		//creamos scanner
		Scanner usuario = new Scanner(System.in);
		
		//ingresar cantidad de articulos
		System.out.println("Ingrese cantidad de articulos a comprar");
		int cantidad = usuario.nextInt();
		
		//creamos variable suma
		int suma = 0;
		
		//algoritmo
		for(int i = 0;i < cantidad;i++) {
			
			//ingresar precios de articulos
			System.out.println("ingrese precio del articulo");
			int precios = usuario.nextInt();
			
			//sumamos precios
			suma = suma + precios;
			
		}
		
		//introducimos descuento
		int total_descuento = (int) (suma - (suma * 0.20)); //me imagino que ese int convierte decimales a enteros del resultado
		
		//introducimos iva 15%
		int iva = (int) (total_descuento + (total_descuento * 0.15)); 
		
		//imprimimos
		System.out.println("El total de la compra seria " + iva);
		
		//cerramos scanner
		usuario.close();
		
	}
	
}
