package cl.generationc2.f20221025;

import java.util.HashSet;

public class ArregloHashSet {

	public static void main(String[] args) {
		// set o HashSet
		//HashSet<TIPODAATO> nombre_array = new HashSet<TIPODATO>()
		HashSet<String> grupo = new HashSet<String>();
		grupo.add("brisa");
		grupo.add("brisa"); //no se repite
		grupo.add("barbara");
		grupo.add("gerald");
		grupo.add("sebastian");
		grupo.add("fatima");
		System.out.println(grupo);
		
		//verificar el contenido del arreglo
		boolean verificarnombre = grupo.contains("brisa");
		System.out.println("Existe el miembro "+verificarnombre);
		
		//eliminar un elemento por el contenido
		grupo.remove("brisa");
		System.out.println(grupo);
		
		//tamaño del arreglo
		System.out.println("tamaño"+grupo.size());
		
		//recorrer el arreglo
		//for iterador o for de objeto
		for(String miembro : grupo)
		{
			System.out.println("miembro"+miembro);
		}

	}

}
