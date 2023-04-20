package UD_09;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExamenPregunta1 {

	public static void main(String[] args) {
		try {
			//Aquí introduces el nombre de la base de datos 
			String dataBaseName = "examen.db";
			
			//Con esto creamos una conexión a la bbdd, NO HACE FALTA QUE ESTE CREADA
			Connection con = DriverManager.getConnection("jdbc:sqlite:D:\\sqlite\\" + dataBaseName);
			System.out.println("Conexión configurada");
			
			Statement s = con.createStatement();
			System.out.println("Sentencia configurada");
			
			//Con esto creamos la database, cambiamos examen por el nombre de la database que queramos crear
			String dataBasePath = "D:\\sqlite\\" + dataBaseName;
			File db = new File(dataBasePath);
			if(!db.exists()) {
				s.executeUpdate("Create database examen;");
				System.out.println("La base de datos " + dataBaseName + " ha sido creada con éxito.");
			} else {
				System.out.println("La base de datos " + dataBaseName + " ya estaba creada.");
			}
			
			
			
			//El archivo con la estructura de la base de datos
			String filePath = new File("").getAbsoluteFile()+"\\data\\examenSQLite.sql";
			Path path = Paths.get(filePath);
			
			try {
				Utilidades.cargarMariaDB(path, s);
			} catch (IOException e) {
				System.err.println("No se ha podido cargar la base de datos a partir del archivo");
				e.printStackTrace();
			}
			
			
//			Statement sent = con.createStatement();
//			//No es obligatorio poner el punto coma al final
//			String sql = "Select * from empleados";
//			ResultSet resultado = sent.executeQuery(sql);
//			//Una vez hacemos la update e insertamos los datos ya no lo podemos volver a hacer por la primary key
//			// int tuplas = sent.executeUpdate("Insert into empleados values(15, 'andres','baños','zaragoza',649701806,'c\\Claracampoamor',15000,15)");
//			
//			while(resultado.next()) {
//				//Aquí las columnas empiezan por 1, no por 0
//				//Hay que respetar la estructura de la tabla
//				System.out.printf("%4d %15s %15s %d\n",resultado.getInt(1),resultado.getString(2),resultado.getString(3),resultado.getInt(4));
//			}
//			
			
			con.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
