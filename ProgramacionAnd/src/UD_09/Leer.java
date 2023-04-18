package UD_09;
import java.util.Scanner;

public class Leer {
	
	public static int leerInt() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		try {
			int n = Integer.parseInt(s);
			return n;
		} catch (Exception e) {
			System.err.println("POR FAVOR, no rompas mi programita"); 
			return -1;
		}
	}
	public static String leerString() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		return s;
	}
}
