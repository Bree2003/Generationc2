package cl.generationc2.f20221026;

import java.util.Scanner;

public class Capturardatos {

	public static void main(String[] args) 
	{
		Float IMC = CalculoIMC();//->asi se llama el metodo
		System.out.println("su imc es: " + IMC);
		/*
		 * Por debajo de 18.5 Bajo peso 
		 18.5-24.9 Normal 
		 25.0-29.9 Sobrepeso 
		 30.0 mas Obeso
		 */
		//nivelIMC(IMC);

	}
	
	public static Float CalculoIMC()
	{
		// capturar datos ingresados por el usuario
		Scanner scanner = new Scanner(System.in); //system.in pide dato en la consola
		//calculo del IMC;imc = kilos/(estatura*estatura);
		System.out.println("Ingrese su peso en kilogramos");
		float peso = scanner.nextFloat(); //decimales es con coma en la consola
		System.out.println("el peso del paciente es: "+peso);
		System.out.println("Ingrese su estatura");
		float estatura = scanner.nextFloat();
		System.out.println("la estatura del paciente es: "+estatura);
		float IMC = peso / (estatura * estatura);
		
		nivelIMC(IMC);
				
		scanner.close();
		
		return IMC;
	}
	
	public static void nivelIMC(Float IMC)
	{
		if(IMC < 18.5f)
		{
			System.out.println("el paciente esta BAJO PESO");
		}
		else if (IMC >= 18.5f && IMC < 25f)
		{
			System.out.println("el paciente esta NORMAL");
		}
		else if(IMC >= 25f && IMC < 30f)
		{
			System.out.println("el paciente esta SOBREPESO");
		}
		else if(IMC >= 30f)
		{
			System.out.println("el paciente esta OBESO");
		}
	}

}