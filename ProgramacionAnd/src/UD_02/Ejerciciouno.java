package UD_02;

import java.util.Scanner;

//Escriba un programa que calcule el �rea de un tri�ngulo (base x altura /2), pidiendo los datos base y altura al usuario.
public class Ejerciciouno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor de la base del tri�ngulo: ");
		int B = sc.nextInt();
		
		System.out.println("Introduce la altura del tri�ngulo: ");
		int H = sc.nextInt();
		
		System.out.println("El �rea del tri�ngulo con base " + B + " y altura " + H + " es: " + B*H/2);
	}

}
