package UD_01;

import java.util.Scanner;

//Realizar un programa que elija mediante un men� un tipo de figura (tri�ngulo cuadrado rect�ngulo)
//Una vez elegida la opci�n nos pida en cada caso los datos neccesarios para calcular su �rea y nos la muestre

public class Ejercicioonce {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean menu = true;
		int S;
		
		do {
			System.out.println("--------------");
			System.out.println("CALCULAR �REAS");
			System.out.println("--------------");
			System.out.println("Seleccione la figura cuya �rea quiere calcular:");
			System.out.println("1 - tri�ngulo");
			System.out.println("2 - cuadrado");
			System.out.println("3 - rect�ngulo");
			S = sc.nextInt();
			
			while (S <1 || S >3) {
				System.out.println("La opci�n seleccionada no es v�lida.");
				System.out.println("Seleccione la figura cuya �rea quiere calcular:");
				System.out.println("1 - tri�ngulo");
				System.out.println("2 - cuadrado");
				System.out.println("3 - rect�ngulo");
				S = sc.nextInt();
			}
			
			if (S == 1) {
				System.out.println("Introduzca la base del tri�ngulo: ");
				int B = sc.nextInt();
				System.out.println("Introduzca la altura del tri�ngulo: ");
				int H = sc.nextInt();
				int A = B*H/2;
				System.out.println("El �rea del tri�ngulo con base " + B + " y altura " + H +" es: " + A);
			} else if (S == 2) {
				System.out.println("Introduzca el lado del cuadrado: ");
				int L = sc.nextInt();
				System.out.println("El �rea del cuadrado con lado " + L + " es: " + L*L);
			}else if (S == 3) {
				System.out.println("Introduzca el primer lado del rect�ngulo: ");
				int A = sc.nextInt();
				System.out.println("Introduzca el segundo lado del rect�ngulo: ");
				int B = sc.nextInt();
				System.out.println("El �rea del rect�ngulo de lados " + A + " y " + B + " es: " + A*B);
			}
			
			
			
		} while (menu);
		
		
	}

}
