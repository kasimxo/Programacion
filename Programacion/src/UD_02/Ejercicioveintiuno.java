package UD_02;

import java.util.Scanner;

//Escriba un programa que saque por pantalla todos los n�meros primos comprendidos entre dos n�meros introducidos por teclado.
public class Ejercicioveintiuno {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce dos valores para conocer los primos comprendidos entre ambos: ");
			System.out.println("Introduce el primer valor: ");
			int N = sc.nextInt();
			System.out.println("Introduce el segundo valor: ");
			int M = sc.nextInt();
			
			while (M<=N ) {
				System.out.println("El segundo valor introducido no es v�lido.");
				System.out.println("El segundo valor tiene que ser mayor al primero.");
				System.out.println("Introduce el segundo valor: ");
				M = sc.nextInt();
			}
			
			System.out.println("Los primos comprendidos entre " + N + " y " + M + " son:");
			
			for (int i = N; i<=M; i++) {
				if (primo(i)) {
					System.out.print(i + " ");
				}
			}
		
			
		}
			public static boolean primo(int N) {
				
			int contador = 0;

			
			for (int i = 2; i<=(N/2); i++) {
				
				if (N%i == 0) {
					contador++;
				}
				
			}
			
			if (contador > 0) {
				return false;
			} else {
				return true;
			}
		
			
		}

	}