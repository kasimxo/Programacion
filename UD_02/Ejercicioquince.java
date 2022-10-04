import java.util.Scanner;

//Escriba un programa que lea por teclado 20 números reales y 
//calcule su media. Hacerlo sin utilizar 20 variables reales.

public class Ejercicioquince {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean menu = true;
		double media = 0;
		double suma = 0;
		double N = 0;
		double contador = 0;
		
		System.out.println("Introduce valores para conocer su media arrastrada: ");
		
		while (menu) {
			N = sc.nextInt();
			contador++;
			suma = suma + N;
			media = suma / contador;
			System.out.print("La media arrastrada de los valores introducidos hasta el momento es: ");
			System.out.printf("%.2f%n", media);
			System.out.println("Introduce un nuevo valor: ");
		}
			
	}

}
