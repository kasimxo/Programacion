package UD_09;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Utilidades {
	
	/**
	 * Este método te lee un archivo .sql para <b>SQLite</b> línea a línea y te hace la creación de tablas con las restricciones etc.
	 * @param file -> El archivo .sql
	 * @param sentencia -> La sentencia que tengas preparada con la conexión ya hecha.
	 * @throws IOException 
	 */
	static void cargarMariaDB(Path file, Statement sentencia) throws IOException {
		List<String> input = Files.readAllLines(file);
		String sql = "";
		for (String linea : input) {
			if(linea.length()==0 || linea.charAt(0)=='-' && linea.charAt(1)=='-' || linea.charAt(0)=='/' && linea.charAt(1)=='*' ) {
				//En este caso la línea es un comentario o esta vacía y por tanto lo ignoramos
			} else {
				for (int i = 0; i<linea.length(); i++) {
					char curr = linea.charAt(i);
					sql += curr;
					//Aquí comprobamos si es el final de un statement y si lo es, lo ejecutamos
					if(curr==';') {
						try {
							sentencia.execute(sql);
							System.out.println(sql);
							sql = "";
						} catch (SQLException e) {
							System.err.println("No se ha podido ejecutar la sentencia: " + sql);
							e.printStackTrace();
							sql = "";
						}
					}
				}
			}
		}
	}
	
	

	/**
	 * Este método te imprime por pantalla toda una tabla
	 * @param sentencia -> La sentencia que tengas preparada con la conexión ya hecha. 
	 * @param tabla -> El nombre de la tabla en formato String
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
