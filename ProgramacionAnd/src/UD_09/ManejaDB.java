package UD_09;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ManejaDB {

	public static void main(String[] args) {
		try {
			
			//Con esto nos conectamos a la bbdd
			Connection con = DriverManager.getConnection("jdbc:sqlite:D:\\sqlite\\empleados.db");
			//Tendremos que haber cambiado el build path en las propiedades del proyecto para poder incluir librerias externas
			System.out.println("conexion establecida");
			
			Statement sent = con.createStatement();
			//No es obligatorio poner el punto coma al final
			String sql = "Select * from empleados";
			ResultSet resultado = sent.executeQuery(sql);
			//Una vez hacemos la update e insertamos los datos ya no lo podemos volver a hacer por la primary key
			// int tuplas = sent.executeUpdate("Insert into empleados values(15, 'andres','baños','zaragoza',649701806,'c\\Claracampoamor',15000,15)");
			
			while(resultado.next()) {
				//Aquí las columnas empiezan por 1, no por 0
				//Hay que respetar la estructura de la tabla
				System.out.printf("%4d %15s %15s %d\n",resultado.getInt(1),resultado.getString(2),resultado.getString(3),resultado.getInt(4));
			}
			
			
			con.close();
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
