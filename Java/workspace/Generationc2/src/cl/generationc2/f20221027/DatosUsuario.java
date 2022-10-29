package cl.generationc2.f20221027;


import java.util.Scanner;

public class DatosUsuario {

	public static void main(String[] args) {
		
		Usuario usuario = new Usuario();
	
		
		//pedir al usuario ingresar datos
		Scanner d_usuario = new Scanner(System.in); //nunca olvides colocar el system.in
		
			
			System.out.println("Ingrese nombre");
			usuario.setNombre(d_usuario.next());
			System.out.println("Ingrese apellido");
			usuario.setApellido(d_usuario.next());
			System.out.println("Ingrese edad");     //se sobreescribeee
			usuario.setEdad(d_usuario.nextInt());
			System.out.println("Ingrese correo");
			usuario.setCorreo(d_usuario.next());
			System.out.println("Ingrese direccion");
			usuario.setDireccion(d_usuario.next());
			System.out.println(usuario);
			
			
		
		d_usuario.close();

	}

}
