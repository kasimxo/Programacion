package UD_08;
import java.io.*;

public class Ejercicio_pole {

	public static void main(String[] args) {
		
		FileReader fr;
		
		try {
			
			 fr = new FileReader("C:\\Users\\34644\\eclipse-workspace\\Programacion\\data\\Pole.txt");
			 
			 BufferedReader br = new BufferedReader(fr);
			 
			 String linea = br.readLine();
			 
			 while(linea!=null) {
				 String[] splited = linea.split("::");
				 
				 System.out.println(splited[1]);
				 
				 
				 
				 linea=br.readLine();
			 }
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
