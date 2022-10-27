package cl.generationc2.f20221027;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		//programa que realize el calculo de las areas y perimetros de triangulos rectangulos y circunferencias
		//ingresar figura
		//validar que la figura ingresada este dentro de las opciones
		//hacer casos en donde muestre areas y perimetros
		
		Scanner sc = new Scanner(System.in);
		int opciones = 0;
		int contadorErrores = 3;
		menu();
		do
		{
			System.out.println("Seleccione una opcion");
			opciones = sc.nextInt();
			
			//si la opcion es cero, salir del do-while
			if(opciones == 0)
			{
				System.out.println("Usted ha salido del programa");
				break;
			}
			
			if(contadorErrores == 1 && opciones > 3)
			{
				System.out.println("Agoto la cantidad de intentos");
				break;
			}
			else if(opciones < 0 || opciones > 3)
			{
				contadorErrores--;
				System.out.println("Te quedan " + contadorErrores + " intentos");
			}
		}
		while(opciones < 0 || opciones > 3);
		
		
		
		
		if(opciones == 0 || contadorErrores == 0)
		{
			System.out.println("Adios");
		}
		else //solo ingresara opciones 1 2 3 
		{
			
			
			Double resultado_perimetro = 0d;
			Double resultado_area = 0d;
			
			switch (opciones)
			{
			case 1 : //CIRCUNFERENCIA
				System.out.println("Ingresa el diametro");
				Double numero1 = sc.nextDouble();
				resultado_perimetro = numero1 * Math.PI;
				System.out.println(("El perimetro es "+resultado_perimetro));
				resultado_area = (numero1/2)*(numero1/2)*Math.PI;
				System.out.println(("El area es "+resultado_area));
				break;
				
			case 2: //RECTANGULO
			System.out.println("Ingresa el largo");
			numero1 = sc.nextDouble();	
			System.out.println("Ingresa el ancho");
			Double numero2 = sc.nextDouble();
			resultado_perimetro = (2*numero1) + (2*numero2);
			System.out.println(("El perimetro es "+resultado_perimetro));
			resultado_area = numero1 * numero2;
			System.out.println(("El area es "+resultado_area));
			break;
				
			case 3: //TRIANGULO
			System.out.println("Ingresa la base");
			numero1 = sc.nextDouble();
			System.out.println("Ingresa la altura");
			numero2 = sc.nextDouble();	
			resultado_perimetro = numero1 + numero2 + (Math.sqrt((numero2*numero2)+((numero1/2)*(numero1/2)))*2);
			System.out.println(("El perimetro es "+resultado_perimetro));
			resultado_area = (numero1 * numero2) / 2;
			System.out.println(("El area es "+resultado_area));
			break;
			
			default:
				System.out.println("opcion no valida");
				
			}
		}	
		sc.close();
	}
	
	
	public static void menu() //llamar metodo desde el main
	{
		System.out.println("**************");
		System.out.println("     MENU     ");
		System.out.println("**************");
		System.out.println("1.-   Circunferencia");
		System.out.println("2.-  Rectangulo    ");
		System.out.println("3.- Triangulo");
		System.out.println("0.-    Salir     ");
	}
	

}
