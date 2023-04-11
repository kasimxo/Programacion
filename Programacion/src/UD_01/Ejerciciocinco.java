package UD_01;

import java.util.Scanner;


//Escribir un programa que una vez que lea un n�mero N por teclado calcule y escriba sus divisores por la pantalla.
public class Ejerciciocinco {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escribe un valor para conocer sus divisores: ");
		int N = sc.nextInt();
		
		while (N<1) {
			System.out.println("Por favor, introduce un n�mero mayor que 0: ");
			N = sc.nextInt();
			
		}
		
		System.out.println("La lista de divisores de N es: ");
		System.out.print("1 ");
		
		//hacemos un bucle que recorra los n�meros desde 2 hasta N/2 para saber si es divisor de N o no
		//NOTA: como 1 y N siempre son divisores de N, no hace falta calcularlos, los mostraremos al final y ya
		for (int i = 2; i<(N/2) + 1; i++) {
			
			//comprobamos si i es divisor de N  si lo es, lo mostramos
			if (N%i == 0 ) {
				System.out.print(i + " ");
			}
			
		}
		System.out.print(N);
	}

}
