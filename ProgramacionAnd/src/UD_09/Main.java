package UD_09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		
		BaseDeDatos con = null;
			
		try {
			con = new BaseDeDatos();
		} catch (SQLException e) {
			System.out.println("No se ha podido establecer conexión.");
			e.printStackTrace();
		}
		
		while(1==1) {
			menu();
			int sel = Leer.leerInt();
			switch(sel) {
			case 0: 
				System.exit(0);
			case 1:
				//mostrar tabla
				con.mostrarTabla();
				break;
			case 2:
				//insertar Empleado
				con.insertEmpleado();
				break;
			case 3:
				//Eliminar empleado
				con.eliminarEmpleado();
				break;
			case 4:
				//Actualizar sueldo
				con.actualizarSueldo();
				break;
			case 5:
				//sumar el sueldo de todos los trabajadores
				con.sumSueldo();
				break;
			case 6:
				//Contar registros de cada tabla
				con.contarRegistros();
				break;
				
			}
		}
		
	}
	
	
	public static void menu() {
		String[] menu = {"1 - Mostrar tabla","2 - Insertar empleado","3 - Eliminar empleado","4 - Actualizar sueldo","5 - Sumar el salario de todos los trabajadores","6 - Contar los registros de cada tabla","0 - Salir"};
		for (String string : menu) {
			System.out.println(string);
		}
	}

}
