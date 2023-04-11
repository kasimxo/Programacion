package UD_01;

import java.util.Scanner;

//Leer un n�mero N que debe filtrarse entre 1 y 100 y a continuaci�n calcular y escribir la tabla de multiplicar de ese n�mero 
public class Ejerciciocuatro {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un valor entre 1 y 100: ");
		int N = sc.nextInt();
		
		//comprobamos que N est� entre 1 y 100
		while (N<1 || N>100) {
			
			System.out.println("El n�mero introducido no es v�lido.");
			System.out.println("Introduce un valor entre 1 y 100: ");
			N = sc.nextInt();
		}
		
		System.out.println("TABLA DE MULTIPLICAR DE " + N);
		
		//hacemos un bucle que solo se ejecute 10 veces, ya que es lo que necesitamos para la tabla de multiplicar
		for (int i = 1; i<=10; i++) {
			
		
			System.out.println(N + " * " + i + " = " + N*i);
		}

	}

}
