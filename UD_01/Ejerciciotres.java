import java.util.Scanner;

//Calcular la suma de los cuadrados de los n�meros pares comprendidos entre 1 y N 
//N es una variable que se leer� del exterior por el teclado.

public class Ejerciciotres {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Scanner teclado = new Scanner(System.in);
				//Cada vez que queramos que el usuario ponga un n�mero utilizamos "teclado"
				int SumaPar = 0;
				int N = 0;
				//establecemos todas las variables
			
				System.out.println("Introduzca el valor:");
				N = teclado.nextInt();
				
				while (N<=1) {
						//aqu� tengo que modificar el bucle para que compruebe que N sea >= 1
					System.out.println("El valor introducido tiene que ser mayor a 1.");
					System.out.println("Introduzca el valor:");
					N = teclado.nextInt();
				}
				
				//hacemos un bucle para recorrer todos los n�meros desde 1 a N
				for (int i = 1; i<=N; i++){

					//Comprobamos si cada n�mero es par
					if (i % 2 == 0) {
						SumaPar = SumaPar+i*i;
						//NOTA: en java, utilizar i^2 no funcionar�a

					}
				}
				System.out.println("La suma de los cuadrados de los n�meros pares comprendidos entre 1 y " + N + " es: " + SumaPar);	


	}

}
