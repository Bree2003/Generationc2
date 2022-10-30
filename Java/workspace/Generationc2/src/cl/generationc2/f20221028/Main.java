package cl.generationc2.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// instanciar a Estudiante
		/*Estudiante estudiante = new Estudiante("Mijail","Loren","27868123-4");
		System.out.println(estudiante);
		estudiante.setCorreo("m@m.cl");
		estudiante.setEdad(3);
		estudiante.setCurso("1A");
		System.out.println(estudiante);
		System.out.println(estudiante.toString());*/
		
		capturarEstudiante();
		//recorrerArreglo();
		
	}
	
	public static void capturarEstudiante ()
	{
Scanner sc = new Scanner (System.in);
		
		//arreglo de estudiantes
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		
		Integer opcion = 0;
		
		do
		{
			//instancia al objeto estudiante
			Estudiante estudiante = new Estudiante();
			System.out.println("Ingrese nombre");
			String nombre = sc.nextLine(); //lee toda la linea
			System.out.println("Ingrese apellido");
			String apellido = sc.nextLine();
			//asignando un valor al atributo
			estudiante.setNombre(nombre);
			estudiante.setApellido(apellido);
			System.out.println(estudiante);
			
			//agregamos un objeto al arreglo con add
			estudiantes.add(estudiante);
			System.out.println(estudiantes);
		}
		while(opcion == 0);
		
		//obtener un estudiante especifico por posicion
	      estudiantes.get(0);
	      //accedemos a un atributo del objeto
	      estudiantes.get(0).getNombre();
		
		sc.close();
		
		
		

	}
	public static void recorrerArreglo(ArrayList<Estudiante> estudiantes)
	{
		 for(Estudiante estudiante : estudiantes)
	      {
		 System.out.println("Nombre: "+estudiante.getNombre());
   	  System.out.println("Apellido: "+estudiante.getApellido());
	      }
	}

}
