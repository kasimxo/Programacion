package UD_02;

import java.util.Scanner;

//Dado un n�mero entero positivo, su cr�pulo es el n�mero que se obtiene sumando los d�gitos que lo componen.
public class Ejerciciotreintaydos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un valor para conocer su cr�pulo: ");
		int N = sc.nextInt();
		int M = crapulo(N);
		
		if(crapulo(N)>=10) {
			M=crapulo(M);
		}
		

		
		System.out.println(M);
	
	}
	
	public static int crapulo(int N) {
		
		int sumadigitos=0;
		String s = String.valueOf(N);
		
		for (int numerodigitos = s.length(); numerodigitos>=1; numerodigitos--) {
			char a = s.charAt(numerodigitos-1);
			//System.out.println(a + " " + numerodigitos);
			int n1 = Character.getNumericValue(a);
			sumadigitos = sumadigitos + n1;
			//System.out.println(sumadigitos);
		}
		N = sumadigitos;
		return N;
	}
	

}
