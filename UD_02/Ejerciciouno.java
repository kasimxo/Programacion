import java.util.Scanner;

//Escriba un programa que calcule el área de un triángulo (base x altura /2), pidiendo los datos base y altura al usuario.
public class Ejerciciouno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el valor de la base del triángulo: ");
		int B = sc.nextInt();
		
		System.out.println("Introduce la altura del triángulo: ");
		int H = sc.nextInt();
		
		System.out.println("El área del triángulo con base " + B + " y altura " + H + " es: " + B*H/2);
	}

}
