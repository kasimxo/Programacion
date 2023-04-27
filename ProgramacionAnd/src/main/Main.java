package main;

import java.sql.SQLException;

import UD_10.Ventana_02;
import controlador.ManejaDb;
import vista.Ventana_CrearTabla;
import vista.Ventana_Insercciones;
import vista.Ventana_Principal;

public class Main {
	
	public static ManejaDb mDB;
	public static Ventana_Principal vp; 
	public static Ventana_Insercciones vi;
	public static Ventana_CrearTabla vct;
	public static String returned;

	public static void main(String[] args) {
		
		
		String dataBaseName = "andres.db";
		
		try {
			mDB = new ManejaDb(dataBaseName);
			mDB.mostrarTablas();
			mDB.createDB("movil");
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		vp = new Ventana_Principal();
		vp.setTitle("Conectado a: " + dataBaseName.substring(0, dataBaseName.length()-3));
		vp.setVisible(true);
		vi = new Ventana_Insercciones();
		vi.setVisible(false);
		vct = new Ventana_CrearTabla();
		vct.setTitle("Crear tabla");
		vct.setVisible(false);
		
	}

}
