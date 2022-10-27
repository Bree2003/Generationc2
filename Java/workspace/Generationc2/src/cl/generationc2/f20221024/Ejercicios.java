package cl.generationc2.f20221024;

import java.util.Arrays;

public class Ejercicios {

	public static void main(String[] args) {
		//ejercicio 1 maximo y minimo
		
		int[] numa10 = {-3,-5, 4,12, 3,35, -35,77,-1, 0};
		int maxNuma10 = 0;
		int minNuma10 = 0;
		for (int i=0; i>=numa10.length; i++ ) {
			numa10[i]=i;
		}
		for (int i=0; i<numa10.length; i++ ) {
			if (maxNuma10 < numa10[i]) {
				maxNuma10 = numa10[i];
			}else if(minNuma10 > numa10[i]){
				minNuma10 =numa10[i];
			}
		}
		System.out.println(Arrays.toString(numa10));
		System.out.println(maxNuma10);
		System.out.println(minNuma10);
		
		//ejercicio 2 pares e impares
		
		int[] impares = new int [numa10.length];
		int[] pares = new int [numa10.length];
		for(int i = 0;i < numa10.length;i++)
		{
			if(numa10[i] % 2 == 0)
			{
				pares[i] = numa10[i];
			}
			else
			{
				impares[i] = numa10[i];
			}
		}
		System.out.println(Arrays.toString(pares));
		System.out.println(Arrays.toString(impares));
		
		//ejercicio 3 promedio
		
		float sumanuma = 0;
		for(int i = 0; i < numa10.length;i++)
		{
			sumanuma = sumanuma + numa10[i];
		}
		System.out.println(sumanuma/10);
		
		
	
		
		
	}

}
