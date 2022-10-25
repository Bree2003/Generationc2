package cl.generationc2.f20221024;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		// arreglos(array) en java
		//estaticos, no cambian de tamaño
		int[] arreglo = new int[3];
		arreglo[0] = 4;
		arreglo[1] = 8;
		arreglo[2] = 12;
		//arreglo[3] = 24; //error fuera de indice
		System.out.println(arreglo);
		System.out.println(Arrays.toString(arreglo));
		System.out.println(arreglo[0]);
		 //{}
		int[] sinnumeros = {}; //cero
		System.out.println(sinnumeros.length);
		
		String[] vocales = {"a","e","i","o","u"}; //a es posicion cero
		System.out.println(vocales.length);
		System.out.println(Arrays.toString(vocales));
		vocales[1] = "o";
		vocales[3] = "e";
		System.out.println(Arrays.toString(vocales));
		//length->cantidad de elementos del arreglo
		//[0] = 4; //->para un arreglo vacio NO SE PUEDE
		//System.out.println(Arrays.toString(sinnumeros));
		
		//crear un array de numeros flotantes de tamaño 6
		float[] numeros = new float[6];
		//agregar 6 elementos al arreglo
		numeros[0] = 33; //está en el rango aceptado de los floats
		numeros[1] = -0.6f;
		System.out.println(Arrays.toString(numeros));
		
		int[] numeroint = new int[2];
		numeroint[0] = (int)0.3; //imprime solo el cero
		System.out.println(Arrays.toString(numeroint));
		
		//crear un arreglo de enteros tamaño 100 y agregar valores dinamicamente, desde el 1 al 100
		
		int[] numeross = new int[100];
		/*for(int i = 0;i<numeross.length;i++)
		{
			numeross[i] = i+1;
		}
		System.out.println(Arrays.toString(numeross));  //ESTO SI
		for(int i = 1;i <= 100;i++)
		{
			numeross[i-1] = i;
		}
		System.out.println(Arrays.toString(numeross));   //NO FUNCIONA
		
		for(int i = 100;i >=0;i--)
		{
			numeross[100-i] = i;
		}
		System.out.println(Arrays.toString(numeross));*/
		
		for(int i = numeross.length;i > 0;i--)
		{
			numeross[numeross.length - i] = i;
;		}
		System.out.println(Arrays.toString(numeross));
		
		//subir colores al array colores
		String [] colores = new String [5];
		colores[0] = "rosa";
		System.out.println(Arrays.toString(colores));
	}

}
