import java.util.Scanner;

//Dado un numero N imprimir la lista de todos los numero primos hasta dicho número N.

public class Ejerciciosiete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número mayor que 1 para conocer todos los números primos hasta ese valor: ");
		int N = sc.nextInt();
		
		System.out.println("Los primos menores que " + N + " son: ");
		
		for (int i = 2; i<N; i++) {
			//usamos la función para saber si i es primo
			if (primo(i)) {
				System.out.print(i + " ");
			}
		}
		
		sc.close();
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
