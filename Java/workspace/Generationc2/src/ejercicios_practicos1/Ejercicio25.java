package ejercicios_practicos1;

import java.util.Scanner;

public class Ejercicio25 {

	public static void main(String[] args) {
		System.out.println("***** Ejercicio 25 *****");
		/*El consultorio del Dr. Homero Simpson tiene como política cobrar la consulta con base en el
		número de cita, de la siguiente forma: las tres primeras citas a $200.000 c/u; las siguientes dos
		citas a $150.000 c/u; las tres siguientes citas a $100.000 c/u y las restantes a $50.000 c/u,
		mientras dure el tratamiento.
    Escriba un programa que permita determinar cuánto pagará un paciente por una cita y
		cuánto pagará un paciente por el total de su tratamiento, dado un número de citas.*/
		
		//creamos scanner
		Scanner s = new Scanner(System.in);
		
		//pedimos numero
		System.out.println("Ingrese numero de citas");
		int citas = s.nextInt();
	
		//llamamos funcion
		consultorio(citas);
		
		//cerramos scanner
		s.close();
	
	}
	
	//funcion 
	static void consultorio (int citas) {
		
		//creamos variable cobro de citas
		int cobro = 0;
		
		//definimos contador
		int contador = 1;
		
		//creamos whiles con ifs
		while(contador <= citas) {
			
			//creamos if a las primeras tres citas
			if(contador <= 3) {
				
				//calculamos
				cobro = cobro + 200000;
				
			}
			
			//creamos if para la cuarta y quinta citas
			if(contador > 3 && contador <= 5) {
				
				//calculamos
				cobro = cobro + 150000;
			}
			
			//creamos if para la sexta, septimay octava cita
			if(contador > 5 && contador <= 8) {
				
				//calculamos
				cobro = cobro + 100000;
			}
			
			//creamos if para las demas citas
			if(contador > 8) {
			
				//calculamos
				cobro = cobro + 50000;
			}
			
			//aumentamos contador
			contador++;
		}
		
		//imprimimos
		System.out.println("El total por las consultas seria " + cobro);
		
	}
	
}
