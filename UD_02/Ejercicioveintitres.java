import java.util.Scanner;

//Escriba un programa que pida un n�mero y nos muestre un cuadrado de asteriscos del tama�o de lado indicado por el n�mero.
public class Ejercicioveintitres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un valor para ver un cuadrado con ese lado: ");
		int N = sc.nextInt();
		
		while (N<1 || N>10) {
			System.out.println("El valor introducido no es v�lido: ");
			System.out.println("Introduce un valor mayor que 0 y menor que 10: ");
			N = sc.nextInt();
		}
		
		for (int i = 0; i < N; i++) {
			for (int a = 0; a < N; a++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
