import java.util.Scanner;

//Dado un numero N que filtraremos a que sea positivo, 
//escribir un programa que nos diga cuál es el numero primo más cercano a él por debajo.
public class Ejercicioocho {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un valor positivo mayor que 1 para conocer su primo mas cercano por debajo: ");
		
		int N = sc.nextInt();
		
		while (N <2) {
			System.out.println("El valor introducido no es válido.");
			System.out.println("Introduce un valor positivo mayor que 1 para conocer su primo mas cercano por debajo: ");
			N = sc.nextInt();
		}
		
		
		//hacemos i = n-1 para evitar que si introducimos un primo nos diga que su primo por debajo es ese mismo
		for (int i = N-1; i>=2; i--) {
			
			if (primo(i)) {
				System.out.print("El primo mas cercano a " + N + " por debajo es " + i);
				break;
				//usamos break para salir del bucle una vez encontramos el primer primo
			}
			
		}
		
		if (N == 2) {
			
			System.out.println("El número 2 es primo, pero no tiene ningún primo menor que él mismo.");
			
		}
		
		
	}
	
	public static boolean primo(int N) {

		int contador = 0;
		//La variable contador para contar todos los divisores de N, si es mayor que 0 N no es primo.
		//NOTA: importante tener en cuenta que un primo siempre tiene dos divisores, 1 y N, así que debemos excluir esos
		
		
		for (int i = 2; i<=(N/2); i++) {
			
			if (N%i == 0) {
				contador++;
			}
			
		}
		
		if (contador > 0) {
				return false;
			} else {
				return true;
			}
		
		}
}
