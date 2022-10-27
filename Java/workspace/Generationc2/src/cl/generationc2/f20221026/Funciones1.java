package cl.generationc2.f20221026;

import java.util.Arrays;

public class Funciones1 {

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
		String nombreCompleto = getNombreCompleto("Brisa", "Sandoval", "Hernandez");
		System.out.println(nombreCompleto);
		llamadaAOtroMetodo();
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
	
	/**
	 * 
	 * @param nombre
	 * @param apePaterno
	 * @param apeMaterno
	 * @return nombreCompleto
	 */
	
	public static String getNombreCompleto(String nombre,String apePaterno,String apeMaterno)
	{
		String nombreCompleto = nombre + " " + apePaterno + " " + apeMaterno;
		return nombreCompleto;
	}//swagger
	
	//metodo que llama a otro metodo
	
	public static void llamadaAOtroMetodo() {
		System.out.println("Llamada a otro metodo desde un metodo");
		metodos(1234, 54.3f);
	}
}
