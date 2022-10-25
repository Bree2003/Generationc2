package cl.generationc2.f20221025;

import java.util.Arrays;

public class funciones1 {

	public static void main(String[] args) {
		// funciones o metodo
		//llamar a un metodo
		nombreMetodo();
		metodo2("Brisa");
		metodo2("Sandoval");
		metodo(19);
		metodos(19,9.9F);
		String[] vocales = {"a","e","i","o","u"};		
		arreglo(vocales);
		System.out.println(retorno1());
		Integer valorRetornado = retorno1();
		System.out.println(valorRetornado + 35);
	}
	//definicion o estructura de un metodo
	//void->el metodo no retorna ningun valor
	public static void nombreMetodo()  //buena practica escribirlo en minuscula
	{
		System.out.println("estoy dentro del metodo inicial");
	}
	
	public static void metodo2(String nombre)  
	{
		System.out.println("hola soy " + nombre);
	}
	
	public static void metodo(Integer numero)  
	{
		System.out.println("hola soy " + numero);
	}
	
	public static void metodos(Integer numero1,Float numero2)  
	{
		System.out.println("hola soy " + numero1);
		System.out.println("hola soy " + numero2);
	}
	
	public static void arreglo(String[] arreglito)  
	{
		System.out.println("hola soy " + Arrays.toString(arreglito));
	}
	
	//funciones con retorno
	public static Integer retorno1()
	{
		Integer totalAlumnos = 35;
		return totalAlumnos;
	}
}
