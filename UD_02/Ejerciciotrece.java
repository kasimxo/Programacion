import java.util.Scanner;

//Escriba un programa que calcule el valor absoluto de un número.
public class Ejerciciotrece {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para conocer su valor absoluto: ");
		int N = sc.nextInt();
		System.out.print("El valor absoluto de " + N);
		if (N<0) {
			N = N*-1;
		}
		System.out.print(" es: " + N);

	}

}
