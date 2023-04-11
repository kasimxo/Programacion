package UD_08;
import java.io.*;

public class Ejercicio_tarifas {

	private static double tarifa = 0.5;
	
	public static void main(String[] args) {
		
		FileReader data;
		FileWriter output;
		
		try {
			
			String filePath = new File("").getAbsolutePath();
			data = new FileReader(filePath+"\\data\\Times.txt");
			output = new FileWriter(filePath+"\\data\\Tarifas.txt");
			
			BufferedReader br = new BufferedReader(data);
			BufferedWriter bw = new BufferedWriter(output);
			
			//Con esta línea limpiamos el archivo por si ya estuviera creado de antes
			bw.write("Tarifas calculadas:\n");
			
			String line=br.readLine();
			
			while(line!=null ) {
				
				String intoSeconds = pasar_a_segundos(line);
				
				int coste = calcular_coste(intoSeconds);
				
				double costeEnEuros = convertir_a_euros(coste);
				
				line=br.readLine();
				
				String tarifaCalculada = "" + costeEnEuros;
				
				bw.append(tarifaCalculada + " �\n");
				bw.flush();
			}
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/*
	Método convertir_a_euros: Para expresar la cantidad anterior en
	euros.
	*/
	private static double convertir_a_euros(int coste) {
		return (double) (coste)/100;
	}

	
	
	/* 
	Métodos getTarifa y setTarifa: Por defecto 0.5 céntimos de euro por
	segundo, pero puede ser modificable. Como no es posible cobrarle
	al cliente medio céntimo, se redondeará la cantidad hacia arriba.
	*/
	private static void setTarifa(double d) {
		tarifa = d;
	}
	
	private static double getTarifa() {
		return tarifa;
	}
	
	
	/*
	Método calcular_coste: Una vez tenemos el método anterior, se
	procederá al cálculo de la misma teniendo en cuenta cuál es la
	tarifa vigente. Este método devolverá un valor que corresponde a
	los céntimos de euro consumidos.
	*/
	private static int calcular_coste(String intoSeconds) {
		
		int data = Integer.parseInt(intoSeconds);
		double d = data*getTarifa();
		
		return (int) Math.ceil(d);
	}

	
	
	/*
	Método pasar_a_segundos: Cada comunicación se expresa en
	horas, minutos y segundos. Se necesita unificar estos datos, para
	calcular la tarifa de cada comunicación (céntimos de € por
	segundo). Se debe pensar cuales son los parámetros de entrada y
	el valor que debe devolver.
	*/
	private static String pasar_a_segundos(String line) {
		
		String[] split = line.split(":");
		
		String intoSeconds = "" + (Integer.parseInt(split[0])*3600 + Integer.parseInt(split[1])*60 + Integer.parseInt(split[2]));
		
		return intoSeconds;
	}

	
}
