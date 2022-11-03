package ejercicios_practicos1;

public class Ejercicio31 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 31 *****");
		/*Una persona adquirió un producto para pagar en 20 meses. El primer mes pagó $10.000, el
		segundo $20.000, el tercero $40.000 y así sucesivamente. Realice un algoritmo para determinar
		cuánto debe pagar mensualmente y el total de lo que pagó después de los 20 meses.*/
		
		//variable costo
		int costo = 10000;
		
		//variable total
		int total = 0;
		
		for(int i = 0;i < 20;i++) {
			
			costo = costo + (10000 * i);
			
			total = total + costo;
			
			System.out.println("En el mes " + (i+1) + " se debe pagar un total de " + costo);
		}
		
		System.out.println("En total se debera pagar " + total);
	}
	
}
