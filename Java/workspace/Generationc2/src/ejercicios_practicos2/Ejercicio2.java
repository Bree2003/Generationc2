package ejercicios_practicos2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		/*Los libros publicados tienen un código de 10 dígitos, usualmente localizado en la
		contraportada. El décimo dígito es un dígito de verificación. A este dígito se le conoce como
		checksum (o “suma de verificación”). Esto significa que si se solicita un libro utilizando su ISBN
		(International Standard Book Number), la editorial puede verificar que no se haya cometido un
		error. Ellos simplemente verifican el dígito de checksum. A continuación se muestra cómo
		funciona el dígito de checksum:
		Multiplique el primer dígito por 10, el segundo por nueve, y así sucesivamente, hasta multiplicar
		el noveno dígito por dos. Luego sume los valores. Por ejemplo, el ISBN 0-13-911991-4 da el
		siguiente valor: (0 × 10) + (1 × 9) + (3 × 8) + (9 × 7) + (1 × 6) + (1×5)+(9×4)+(9×3)+(1×2) = 172
		Luego divida el resultado por 11 y calcule el residuo. En el ejemplo, 172 ÷ 11 = 15 residuo 7. Si el
		residuo es cero, entonces el dígito de checksum es cero. De otra manera, reste el residuo de 11
		para obtener el dígito de checksum (11 – 7 = 4). Es posible que se llegue a obtener un valor de
		checksum de 10, lo cual requiere de un dígito más. Cuando esto sucede, se utiliza el carácter
		X. Escriba una función que permita calcular el digito de verificación de acuerdo a la regla
		definida anteriormente.*/

		System.out.println("***** Ejercicio 2 *****");
		
		//crear scanner
		Scanner s = new Scanner(System.in);	
		
		//pedimos nueve digitos
		System.out.println("Ingrese numero de nueve digitos");
		int isbn = s.nextInt();
		
		//llamamos funcion
		libro(isbn);
		
		//cerramos scanner
		s.close();
		
	}
	
	//creamos funcion
	public static void libro(int isbn) {
		
		//creamos variable en donde vamos a sumar
		int resto = 0;
		int suma = 0;
		int numero = isbn;
		int numero_resto = 0;
		
		for(int i = 0;i < 9;i++) {//maldito dieeeez, como colocaba un numero de nueve digitos!!! me dejaba el for para la chucha ahhhhh
			//maldicion, se me olvida restarle uno a la posicion ahhhh
			
			//calculamos
			resto = numero % 10;
			resto = resto *(i + 2);
			suma = suma + resto;
			numero = (int)(numero / 10);
			
			
			
			
		}
		
		//imprimimos
		numero_resto = suma % 11;
		
		if(numero_resto == 0) {
			
			System.out.println("ISBN " + isbn + "-" + numero_resto);
		}else if(numero_resto == 1){
			System.out.println("ISBN " + isbn + "-x");
			
		}
		else if(numero_resto != 0 && numero_resto != 10) {
			numero_resto = 11 - numero_resto;
			System.out.println("ISBN " + isbn + "-" + numero_resto);
		}
		
		
	}

}
