package UD_01;

import java.util.Scanner;

//Hacer un programa que lea un n�mero N y nos escriba en la pantalla mediante un mensaje si es � no primo 
public class Ejercicioseis {

	public static void main(String[] args) {
		
		int contador = 0;
		//La variable contador para contar todos los divisores de N, si es mayor que 0 N no es primo.
		//NOTA: importante tener en cuenta que un primo siempre tiene dos divisores, 1 y N, as� que debemos excluir esos
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un valor mayor que 1 para saber si es primo: ");
		
		int N = sc.nextInt();
		
		while (N<2) {
			System.out.println("El valor introducido no es v�lido.");
			System.out.println("Introduce un valor mayor que 1 para saber si es primo: ");
			N = sc.nextInt();
		}
		
		for (int i = 2; i<=(N/2); i++) {
			
			if (N%i == 0) {
				contador++;
			}
			
		}
		
		if (contador > 0) {
			System.out.println(N + " no es primo.");
		} else {
			System.out.println(N + " es primo.");
		}
	
		
	}

}
