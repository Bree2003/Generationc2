package cl.generationc2.f20221025;

import java.util.HashMap;

public class ArregloHashMap {

	public static void main(String[] args) {
		/*
		// Create a HashMap object called capitalCities
	    HashMap<String, String> capitalCities = new HashMap<String, String>();

	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);
	    
	    //capitalCities.get("England");
	    
	    //capitalCities.remove("England");
	    
	    //capitalCities.clear(); ->borra todos los elementos
	    
	    System.out.println(capitalCities.size());
	    
	    //print keys
	    for (String i : capitalCities.keySet()) {
	    	  System.out.println(i);
	    	}
	    
	 // Print values
	    for (String i : capitalCities.values()) {
	      System.out.println(i);
	    }
	    
	 // Print keys and values
	    for (String i : capitalCities.keySet()) {
	      System.out.println("key: " + i + " value: " + capitalCities.get(i));
	    }
	    boolean verificacionCiudad = capitalCities.containsKey("Germany");
	    System.out.println("Existe la ciudad? " +verificacionCiudad);*/
		
		//HashMap
		//llave,valor (key, value)
		HashMap<Integer,String> grupo = new HashMap<Integer,String>();
		//agregar valores al mapa
		grupo.put(11,"brisa");
		grupo.put(22,"barbara");
		grupo.put(35,"gerald");
		grupo.put(4,"sebastian");
		grupo.put(5,"fatima");
		//grupo.put(35,"brisa null"); ->sobreescribe valor si existe esa clave
		System.out.println("map"+grupo);
		//tamaño
		System.out.println(grupo.size());
		//acceder a un dato
		
		System.out.println(grupo.get(35)); //gerald
		
		//eliminar un  par de datos
		
		grupo.remove(35);
		System.out.println("map"+grupo);
		
		//recorrer un mapa
		
		/* for (Map.Entry<Integer, String> entry : map.entrySet()) {
			Integer key = entry.getKey();
			String val = entry.getValue();
			*/
		for(Integer clave :grupo.keySet())
		{
			System.out.println("clave"+clave);
			System.out.println("valor"+grupo.get(clave));
		}
		
			
		}
		
	    
	}


