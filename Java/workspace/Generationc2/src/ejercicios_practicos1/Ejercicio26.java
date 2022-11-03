package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio26 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 26 *****");
		/*La fábricas “Aplaplac” produce artículos con claves (1, 2, 3, 4, 5 y 6). Escriba un programa que
		permita calcular los precios de venta, de acuerdo a las siguientes reglas:
		• Costo de producción = materia prima + mano de obra + gastos de fabricación.
		• Precio de venta = costo de producción + 45 % de costo de producción.
		• El costo de la mano de obra se obtiene de la siguiente forma: para los productos con clave
		3 o 4 se carga 75 % del costo de la materia prima; para los que tienen clave 1 y 5 se carga
		80 %, y para los que tienen clave 2 o 6, 85 %.
		Para calcular el gasto de fabricación se considera que si el artículo que se va a producir tiene
		claves 2 o 5, este gasto representa 30 % sobre el costo de la materia prima; si las claves son 3 o
		6, representa 35 %; si las claves son 1 o 4, representa 28 %. La materia prima tiene el mismo
		costo para cualquier clave.*/
		
		//creamos scanner
		Scanner s = new Scanner(System.in);
		
		//pedimos numero
		System.out.println("Ingrese costo de materia prima");
		int materia_prima = s.nextInt();
	
		//llamamos funcion
		fabrica(materia_prima);
		
		//cerramos scanner
		s.close();
	
	}
	
	//funcion 
	static void fabrica (int materia_prima) {
		
		//creamos variables clave1
		int mano_obra1 = 0;
		int gasto_fabricacion1 = 0;
		int costo_produccion1 = 0;
		int precio_venta1 = 0;	
		
		//creamos formula clave1
		mano_obra1 = (int) (materia_prima *0.8); //1 y 5
		gasto_fabricacion1 = (int) (materia_prima * 0.28); //1 y 4
		costo_produccion1 = materia_prima + mano_obra1 + gasto_fabricacion1;
		precio_venta1 = costo_produccion1 + (int) (costo_produccion1 * 0.45);
		
		//imprimimos
		System.out.println("El precio de venta para la clave 1 seria " + precio_venta1);
		
		//creamos variables clave2
		int mano_obra2 = 0;
		int gasto_fabricacion2 = 0;
		int costo_produccion2 = 0;
		int precio_venta2 = 0;	
			
		//creamos formula clave2
		mano_obra2 = (int) (materia_prima *0.85); //2 y 6
		gasto_fabricacion2 = (int) (materia_prima * 0.3); //2 y 5
		costo_produccion2 = materia_prima + mano_obra2 + gasto_fabricacion2;
		precio_venta2 = costo_produccion2 + (int) (costo_produccion2 * 0.45);
				
		//imprimimos
		System.out.println("El precio de venta para la clave 2 seria " + precio_venta2);
		
		//creamos variables clave3
		int mano_obra3 = 0;
		int gasto_fabricacion3 = 0;
		int costo_produccion3 = 0;
		int precio_venta3 = 0;	
				
		//creamos formula clave3
	    mano_obra3 = (int) (materia_prima *0.75); //3 y 4
	    gasto_fabricacion3 = (int) (materia_prima * 0.35); //3 y 6
		costo_produccion3 = materia_prima + mano_obra3 + gasto_fabricacion3;
		precio_venta3 = costo_produccion3 + (int) (costo_produccion3 * 0.45);
				
		//imprimimos
		System.out.println("El precio de venta para la clave 3 seria " + precio_venta3);
		
		//creamos variables clave4
		int mano_obra4 = 0;
		int gasto_fabricacion4 = 0;
		int costo_produccion4 = 0;
		int precio_venta4 = 0;	
				
		//creamos formula clave4
		mano_obra4 = (int) (materia_prima *0.75); //3 y 4
		gasto_fabricacion4 = (int) (materia_prima * 0.28); //1 y 4
		costo_produccion4 = materia_prima + mano_obra4 + gasto_fabricacion4;
		precio_venta4 = costo_produccion4 + (int) (costo_produccion4 * 0.45);
				
		//imprimimos
		System.out.println("El precio de venta para la clave 4 seria " + precio_venta4);
		
		//creamos variables clave5
		int mano_obra5 = 0;
		int gasto_fabricacion5 = 0;
		int costo_produccion5 = 0;
		int precio_venta5 = 0;	
				
		//creamos formula clave5
		mano_obra5 = (int) (materia_prima *0.8); //1 y 5
		gasto_fabricacion5 = (int) (materia_prima * 0.3); //2 y 5
		costo_produccion5 = materia_prima + mano_obra5 + gasto_fabricacion5;
		precio_venta5 = costo_produccion5 + (int) (costo_produccion5 * 0.45);
				
		//imprimimos
		System.out.println("El precio de venta para la clave 5 seria " + precio_venta5);
		
		//creamos variables clave6
		int mano_obra6 = 0;
		int gasto_fabricacion6 = 0;
		int costo_produccion6 = 0;
		int precio_venta6 = 0;	
				
		//creamos formula clave6
		mano_obra6 = (int) (materia_prima *0.85); //2 y 6
		gasto_fabricacion6 = (int) (materia_prima * 0.35); //3 y 6
		costo_produccion6 = materia_prima + mano_obra6 + gasto_fabricacion6;
		precio_venta6 = costo_produccion6 + (int) (costo_produccion6 * 0.45);
				
		//imprimimos
		System.out.println("El precio de venta para la clave 6 seria " + precio_venta6);
		
	}
	
}
