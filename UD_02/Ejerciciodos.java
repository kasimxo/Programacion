import java.util.Scanner;

//Escriba un programa que determine si un número leído desde teclado es positivo, negativo, o cero.

public class Ejerciciodos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un valor para saber si es positivo o negativo: ");
		int N = sc.nextInt();
		if (N<0) {
			System.out.println(N + " es negativo.");
		} else if (N>0) {
			System.out.println(N + " es positivo.");
		} else {
			System.out.println("El número introducido es 0.");
		}
	}

}
