package UD_08;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class Ejercicio_url {

	public static void main(String[] args) {
		
			try {
				//Primero conectamos con la url
				URL url = new URL("https://www.aemet.es/xml/municipios/localidad_50297.xml");
				URLConnection urlCon = url.openConnection();
				
				//Ahora establecemos un scanner del contenido de la página
			    Scanner sc = new Scanner(urlCon.getInputStream());
			   
			    //Aquí hacemos un print en pantalla del contenido simplemente para ver que funciona
			    while(sc.hasNext()) {
				    System.out.println(sc.next());
			    }
			    
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			   
	}
}
