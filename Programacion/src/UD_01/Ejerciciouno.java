package UD_01;

import java.util.Scanner;

//Escribir un programa que calcule e imprima la SUMA de los n�meros impares comprendidos entre A y B 
//deben leerse por teclado y filtrarse para que A<=B.

public class Ejerciciouno {

	public static void main(String[] args) {
		
		//declaramos las dos variables que pedimos al usuario y la variable que sera la suma
		int A = 0;
		int B = 0;
		int Suma = 0;
		
		//inicializamos el scanner que leera los n�meros introducidos por el usuario
		Scanner sc = new Scanner(System.in);
		
		//pedimos la primera variable
		System.out.print("Introduce un valor: ");
		A = sc.nextInt();
		
		//pedimos la segunda variable
		System.out.println("Introduce el segundo valor: ");
		B = sc.nextInt();
		
		//nos aseguramos de que la segunda variable es mayor que la primera
		//si no lo es, volvemos a pedir el segundo valor
		while (A > B) {
			
			System.out.println("El segundo valor debe ser mayor al primero.");
			System.out.println("Introduce el segundo valor: ");
			B = sc.nextInt();
			
		}
		
		//hacemos un loop que recorra los n�meros desde A hasta B
		for (int i = A; i <= B; i++) {
			
			//hacemos un condicional que comprueba si el n�mero es par o impar
			if (i%2 != 0) {
				
				//si es impar, lo a�adimos a la suma
				Suma = Suma + i;
			
			}
		
		}
		System.out.println("La suma de los n�meros impares comprendidos entre " + A + " y " + B + " es " + Suma + ".");
		
		
	}

}
