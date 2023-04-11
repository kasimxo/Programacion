package UD_01;

import java.util.Scanner;

//Hacer un programa que lea un n�mero N filtrando a que sea mayor que cero y calcule su factorial

public class Ejerciciodiez {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//el valor de factorial lo declaramos como long porque puede ser muy largo
		long valorfactorial= 1;
		
		System.out.println("Introduce un valor mayor que cero para calcular su factorial: ");
		
		int N = sc.nextInt();
		
		while (N<1) {
			System.out.println("El valor introducido no es v�lido.");
			System.out.println("Introduce un valor mayor que cero para calcular su factorial: ");
			N = sc.nextInt();
		}
		
		//NOTA: importante empezar en 1 para no multiplicar por 0
		for (int i = 1; i<=N; i++) {
			valorfactorial = valorfactorial*i; 
		}
		
		System.out.println("El valor de " + N + "factorial es: " + valorfactorial);
		

	}

}
