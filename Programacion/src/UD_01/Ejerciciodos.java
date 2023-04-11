package UD_01;

import java.util.Scanner;

//Programa que sume los pares y los impares (por separado) de los n�meros comprendidos entre N y M 
//se habr�n le�do por teclado, filtrando de manera que N<=M.

public class Ejerciciodos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int SumaPar = 0;
		int SumaImpar = 0;
		int N = 0;
		int M = 0;
		//establecemos todas las variables
	
		//pedimos al usuario los valores
		System.out.println("Introduzca el valor 1:");
		N = sc.nextInt();

		
		System.out.println("Introduzca el valor 2:");
		M = sc.nextInt();
		
		//nos aseguramos de que la segunda variable sea mayor que la primera
		while (N>M) {
			System.out.println("Error: El valor 2 no puede ser mayor que el valor 1");
			System.out.println("Introduzca el valor 2:");
			M = sc.nextInt();
		}
		
		//hacemos un bucle que recorra todos los n�meros desde N hasta M
		for (int a = N; a<=M; a++){
			
			//si el n�mero es par, lo sumamos a sumaPar
			if (a % 2 == 0) {
				SumaPar = SumaPar + N;
			}
			else {
				//si el n�mero es impar, lo sumamos a sumaimpar
				SumaImpar = SumaImpar + N;
			}
			
		}
		//mostramos el resultado
		System.out.println("La divisi�n de los n�meros pares comprendidos entre " + N + " y " + M + " es: " + SumaPar);
		System.out.println("La divisi�n de los n�meros impares comprendidos entre " + N + " y " + M + " es: " + SumaImpar);

	}

}
