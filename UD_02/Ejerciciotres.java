import java.util.Scanner;

//Escriba un programa que lea dos números desde teclado y si el primero es mayor que el segundo
//intercambie sus valores y los muestre ordenados por pantalla (después de haber intercambiado el valor de las variables correspondientes).

public class Ejerciciotres {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el primer valor: ");
		int N = sc.nextInt();
		System.out.println("Introduce el segundo valor: ");
		int M = sc.nextInt();
		
		if (M>N) {
			int aux = N;
			N = M;
			M = aux;
		}
		
		System.out.println("Los valores introducidos ordenados de menor a mayor son: " + N + " " + M);
	}

}
