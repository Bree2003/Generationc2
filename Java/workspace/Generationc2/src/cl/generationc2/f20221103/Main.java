package cl.generationc2.f20221103;

//import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Objetos de colaboracion

		Usuario usuario = new Usuario();
		/*ArrayList<String> telefono = new ArrayList <String>();
		telefono.add("5665262626");
		telefono.add("1561561561");
		usuario.setTelefono(telefono);
		System.out.println(usuario);*/
		usuario.getTelefono().add("165151"); //get traer el tipo de dato
		//usuario.setTelefono(null).add("2165115"); no se puede porque nos pide colocar nombre araray list
		usuario.getTelefono().add("51651165");
		System.out.println(usuario.getTelefono());
		Direccion direccion = new Direccion();
		direccion.setCalle("Los pablos");
		direccion.setNumero("1234");
		direccion.setCiudad("temuco");
		direccion.setRegion("araucania");
		usuario.setDireccion(direccion);
		usuario.getDireccion().setSector("norte");
		//usuario.setDireccion("Los pablos 1234, temuco");
		System.out.println(usuario.getDireccion());//nos arroja el espacio de memoria
		
		//Usuario usuario2 = new Usuario();
		//usuario.setDireccion("Los pablos 4321, temuco");
	}

}
