package UD_09;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Utilidades {

	/**
	 * Este método te imprime por pantalla toda una tabla
	 * @param sentencia
	 * @param tabla
	 */
	static void mostrarTabla(Statement sentencia, String tabla) {
		try {
			ResultSet res = sentencia.executeQuery("SELECT * FROM " + tabla);
			ResultSetMetaData rsmd = res.getMetaData();
			//Este es el número de columnas en la tabla
			int columnsNumber = rsmd.getColumnCount();
			//dibuja cabecera
			for (int i = 1; i <= columnsNumber; i++) {
				
				
				System.out.printf("| %15s ", rsmd.getColumnName(i).toUpperCase());
			}
			System.out.println("|");
			for (int i = 0; i<columnsNumber*18;i++) System.out.print("-");
			System.out.println("-");
			while (res.next()) {
				for (int i = 1; i <= columnsNumber; i++) {
					String columnValue = res.getString(i);
					System.out.printf("| %15s ", columnValue );
				}
				System.out.printf("|\n");
				
			}

			

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
}
