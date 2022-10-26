package cl.generationc2.f20221026;

import java.util.Scanner;

public class UsuarioIMC {

	public static void main(String[] args) {
		// USUARIO IMC
		
	Scanner usuario = new Scanner(System.in); //cuando aplicamos nos dejar escribir en la consola
	//System.out.println(nombre); //solo se puesde escribir syso en void
	
	//NOMBRE COMPLETO
	System.out.println("Ingresa tu nombre completo");
	String nombre_completo = usuario.next()+" "+usuario.next()+" "+usuario.next(); //el espacio cuenta como un enter
	
	//EDAD
	System.out.println("Ingresa tu edad");
	Integer edad = usuario.nextInt();
	
	//PESO
	Float kilo = 0f;
	do
	{
		System.out.println("Ingresa tu peso en kilogramos (decimales)");
		kilo = usuario.nextFloat(); //maldito : por eso no me andaba //al reescribir una variable no colocar tipo maldicionnn todo el tiempo que perdi
	}
	while(kilo < 40f || kilo > 150f);
	
	//ESTATURA
	
	Float estatura = 0f;
	do
	{
		System.out.println("Ingresa tu estatura (metros)");
		estatura = usuario.nextFloat();	
	}
	while(estatura < 0.8 || estatura > 2.8);
	
	//RESULTADOS
	System.out.println("Paciente "+nombre_completo);
	System.out.println("Edad "+edad+" años");
	System.out.println("Peso del paciente "+kilo+" kilos");
	System.out.println("Estatura del paciente "+estatura+" metros");
	
	//NIVEL IMC
	/*
	 * Por debajo de 18.5 Bajo peso 
	 18.5-24.9 Normal 
	 25.0-29.9 Sobrepeso 
	 30.0 mas Obeso
	 */
	Float IMC = kilo / (estatura * estatura);
	System.out.println("IMC "+IMC);
	if(IMC < 18.5)
	{
		System.out.println("El paciente esta BAJO PESO");
	}
	else if(IMC >= 18.5 && IMC < 25)
	{
		System.out.println("El paciente esta NORMAL");
	}
	else if(IMC >= 25 && IMC < 30)
	{
		System.out.println("El paciente esta SOBREPESO");
	}
	else if(IMC >= 30)
	{
		System.out.println("El paciente esta OBESO");
	}
	
	
	usuario.close();
}
}