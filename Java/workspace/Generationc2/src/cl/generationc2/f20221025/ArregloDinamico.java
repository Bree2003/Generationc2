package cl.generationc2.f20221025;

import java.util.ArrayList;

public class ArregloDinamico {

	public static void main(String[] args) {
		// ArrayList
		//definicion
		//ArrayList<TIPODATO> nombre_array = new ArrayList<TIPODATO>
		ArrayList<String> grupo3 = new ArrayList<String>();
		//agregar valores al arreglo
		grupo3.add("Brisa");
		grupo3.add("Barbara");
		grupo3.add("Gerald");
		grupo3.add("Sebastian");
		grupo3.add("Fatima");
		System.out.println(grupo3);
		//tamaño arraylist
		System.out.println(grupo3.size());
		//length->arrey estatico;size->arrey dinamico
		//obtner un elemento dentro del arrey
		System.out.println(grupo3.get(3));
		//System.out.println(grupo3.get(7)); ->esta fuera del indice
		//eliminar elemento dentro del array
		grupo3.remove(0);
		System.out.println(grupo3);
		//agrregar en una cierta posicion
		grupo3.add(2, "Brisa");
		System.out.println(grupo3);
		//recorrer el arreylist
		for(int i = 0;i < grupo3.size();i++)
		{
			System.out.println("Grupo 3:" + grupo3.get(i));
		}
		//for iterador o for de objeto
		for(String miembrogrupo : grupo3)
		{
			System.out.println("miembrogrupo " + miembrogrupo);
		}
		//System.out.println(miembrogrupo);->no existe fuera del for
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		for(Integer numero : numeros)
		{
			System.out.println(numero);
		}
		
	}

}
