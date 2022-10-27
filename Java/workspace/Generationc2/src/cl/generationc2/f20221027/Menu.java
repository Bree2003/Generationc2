package cl.generationc2.f20221027;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		//Menu
		//calculadora con 4 operaciones basicas
		//solicitar y capturar 2 numeros float
		//imprimir resultados y guardar en una variable
		//ofrecer opciones de repeticion (bucles)
		//menu de acciones
		//definir los metodos
		//validaciones
		//terminar la ejecucion
		//limpiar las variables
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
			
			if(contadorErrores == 1 && opciones > 4)
			{
				System.out.println("Agoto la cantidad de intentos");
				break;
			}
			else if(opciones < 0 || opciones > 4)
			{
				contadorErrores--;
				System.out.println("Te quedan " + contadorErrores + " intentos");
			}
		}
		while(opciones < 0 || opciones > 4);
		
		
		if(opciones == 0 || contadorErrores == 0)
		{
			System.out.println("Adios");
		}
		else //solo ingresara opciones 1 2 3 4
		{
			System.out.println("Ingresa el primer numero");
			Float numero1 = sc.nextFloat();
			System.out.println("Ingresa el segundo numero");
			Float numero2 = sc.nextFloat();
			
			Float resultado = 0f;
			
			switch (opciones)
			{
			case 1: //SUMAR
				resultado = numero1 + numero2;
				System.out.println(("El resultado es "+resultado));
				break;
			case 2: //RESTA
				resultado = numero1 - numero2;
				System.out.println(("El resultado es "+resultado));
				break;
			case 3 : //MULTIPLICACION
				resultado = numero1 * numero2;
				System.out.println(("El resultado es "+resultado));
				break;
			case 4: //DIVISION 0/0->NaN numero/0->Infinity
				if(numero2 == 0)
				{
					do
					{
					System.out.println("NO SE PUEDE DIVIDIR POR CERO");
					System.out.println("Ingrese otro numero");
					numero2 = sc.nextFloat();
					
					}
					while(numero2 == 0);
					resultado = numero1 / numero2;
					System.out.println(("El resultado es "+resultado));	
					
				}
				else
				{
				resultado = numero1 / numero2;
				System.out.println(("El resultado es "+resultado));
				}
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
		System.out.println("1.-     Suma     ");
		System.out.println("2.-    Resta     ");
		System.out.println("3.-Multiplicacion");
		System.out.println("4.-   Division     ");
		System.out.println("0.-    Salir     ");
	}
}
