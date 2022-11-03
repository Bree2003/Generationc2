package cl.generationc2.f20221102;

import java.util.ArrayList;
import java.util.Scanner;

public class main_colegio {

	public static void main(String[] args) {
		// crear colegio
		//crear scanner
				Scanner s = new Scanner(System.in);
				
		//meter profesores
		ArrayList<Profesores> profesores = new ArrayList<Profesores>();
		//meter alumnos
		ArrayList<Alumno> estudiantes = new ArrayList<Alumno>();
		//meter administrativos
		ArrayList<Administrativos> administrativos = new ArrayList<Administrativos>();
		
		//administrativos
		//variable opciones
		int opciones = 0;
		do {
			System.out.println("Ingrese (1) agregar administrativo, (2) dejar de agregar");
			opciones = s.nextInt();
			Administrativos administrativo = new Administrativos();
			switch(opciones) {
			case 1:
				System.out.println("Ingrese nombre");
				administrativo.setNombre(s.next());
				System.out.println("Ingrese apellido");
				administrativo.setApellido(s.next());
				System.out.println("Ingrese edad");
				administrativo.setEdad(s.nextInt());
				System.out.println("Ingrese correo");
				administrativo.setCorreo(s.next());
				System.out.println("Ingrese area");
				administrativo.setArea(s.next());
				System.out.println("Ingrese cargo");
				administrativo.setCargo(s.next());
				
				administrativos.add(administrativo);
				break;
			case 2:
				System.out.println("Dejo de agregar administrativos");
				break;
			default:
				System.out.println("Opcion no valida, vuelva a ingresar");
			}
		}while(opciones == 1 || opciones < 1 || opciones > 2);
		
		//profesores
		//variable opcion
		int opcione = 0;
		do {
			System.out.println("Ingrese (1) agregar profesor, (2) dejar de agregar");
			opcione = s.nextInt();
			Profesores profesor = new Profesores();
			switch(opcione) {
			case 1:
				System.out.println("Ingrese nombre");
				profesor.setNombre(s.next());
				System.out.println("Ingrese apellido");
				profesor.setApellido(s.next());
				System.out.println("Ingrese edad");
				profesor.setEdad(s.nextInt());
				System.out.println("Ingrese correo");
				profesor.setCorreo(s.next());
				System.out.println("Ingrese jefatura");
				profesor.setJefatura(s.next());
				System.out.println("Ingrese especialidad");
				profesor.setEspecialidad(s.next());
				
				profesores.add(profesor);
				break;
			case 2:
				System.out.println("Dejo de agregar profesores");
				break;
			default:
				System.out.println("Opcion no valida, vuelva a ingresar");
			}
			
			
		}while(opcione == 1 || opcione < 1 || opcione > 2);
		
		//alumnos
		//variable opcion
		int opcion = 0;
		do {
			System.out.println("Ingrese (1) agregar estudiante, (2) dejar de agregar");
			opcion = s.nextInt();
			Alumno estudiante = new Alumno();
			switch(opcion) {
			case 1:
				System.out.println("Ingrese nombre");
				estudiante.setNombre(s.next());
				System.out.println("Ingrese apellido");
				estudiante.setApellido(s.next());
				System.out.println("Ingrese edad");
				estudiante.setEdad(s.nextInt());
				System.out.println("Ingrese correo");
				estudiante.setCorreo(s.next());
				System.out.println("Ingrese curso");
				estudiante.setCurso(s.next());
				System.out.println("Ingrese promedio");
				estudiante.setPromedio(s.nextFloat());
				
				estudiantes.add(estudiante);
				break;
			case 2:
				System.out.println("Dejo de agregar estudiantes");
				break;
			default:
				System.out.println("Opcion no valida, vuelva a ingresar");
			}
		}while(opcion == 1 || opcion < 1 || opcion > 2);
		
		//imprimir administrativos
		for(Administrativos admi:administrativos) {
			System.out.println(admi);
		}
		
		//imprimir profesores
				for(Profesores profe:profesores) {
					System.out.println(profe);
				}
		
		//imprimir alumnos
		for(Alumno estu:estudiantes) {
			System.out.println(estu);
		}
		//cerrar scanner
		s.close();
		
		
	}

}
