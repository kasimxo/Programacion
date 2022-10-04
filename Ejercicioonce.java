import java.util.Scanner;

//Realizar un programa que elija mediante un menú un tipo de figura (triángulo cuadrado rectángulo)
//Una vez elegida la opción nos pida en cada caso los datos neccesarios para calcular su área y nos la muestre

public class Ejercicioonce {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		boolean menu = true;
		int S;
		
		do {
			System.out.println("--------------");
			System.out.println("CALCULAR ÁREAS");
			System.out.println("--------------");
			System.out.println("Seleccione la figura cuya área quiere calcular:");
			System.out.println("1 - triángulo");
			System.out.println("2 - cuadrado");
			System.out.println("3 - rectángulo");
			S = sc.nextInt();
			
			while (S <1 || S >3) {
				System.out.println("La opción seleccionada no es válida.");
				System.out.println("Seleccione la figura cuya área quiere calcular:");
				System.out.println("1 - triángulo");
				System.out.println("2 - cuadrado");
				System.out.println("3 - rectángulo");
				S = sc.nextInt();
			}
			
			if (S == 1) {
				System.out.println("Introduzca la base del triángulo: ");
				int B = sc.nextInt();
				System.out.println("Introduzca la altura del triángulo: ");
				int H = sc.nextInt();
				int A = B*H/2;
				System.out.println("El área del triángulo con base " + B + " y altura " + H +" es: " + A);
			} else if (S == 2) {
				System.out.println("Introduzca el lado del cuadrado: ");
				int L = sc.nextInt();
				System.out.println("El área del cuadrado con lado " + L + " es: " + L*L);
			}else if (S == 3) {
				System.out.println("Introduzca el primer lado del rectángulo: ");
				int A = sc.nextInt();
				System.out.println("Introduzca el segundo lado del rectángulo: ");
				int B = sc.nextInt();
				System.out.println("El área del rectángulo de lados " + A + " y " + B + " es: " + A*B);
			}
			
			
			
		} while (menu);
		
		
	}

}
