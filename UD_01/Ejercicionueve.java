import java.util.Scanner;
//Dado un numero N leído por teclado encontrar el numero P primo mas cercano a él por exceso.

public class Ejercicionueve {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un valor positivo para conocer su primo mas cercano por encima: ");
		
		int N = sc.nextInt();
		
		while (N <1) {
			System.out.println("El valor introducido no es válido.");
			System.out.println("Introduce un valor positivo mayor que 1 para conocer su primo mas cercano por encima: ");
			N = sc.nextInt();
		}
		
		//declaramos una variable que nos servirá para ir calculando los números mayores que N hasta ver uno que sea primo
		int i = N+1;
		
		
		//hacemos i = n+1 para evitar que si introducimos un primo nos diga que su primo por encima es ese mismo
		while (primo(i)==false) {
			i++;
			
		}
		System.out.println("El primo por encima de " + N + " es: " + i);
		
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
