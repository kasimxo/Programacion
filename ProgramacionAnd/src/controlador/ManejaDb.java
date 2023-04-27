package controlador;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import main.Main;

public class ManejaDb {
	
	private String dataBaseName;
	private Connection c;
	
	public ManejaDb(String dataBaseName) throws SQLException {
		this.dataBaseName = dataBaseName;
		this.c = DriverManager.getConnection("jdbc:sqlite:D:\\sqlite\\" + dataBaseName);
		
		
	}
	
	public void changeDataBase(String newDataBaseName) throws SQLException {
		//c.close();
		this.dataBaseName = newDataBaseName;
		this.c = DriverManager.getConnection("jdbc:sqlite:D:\\sqlite\\" + newDataBaseName);
		
	}
	
	
	public List<String> mostrarTablas() {
		List<String> tablas = new ArrayList<String>();
		
		try {
			System.out.println(c.getClientInfo(dataBaseName));
			Statement sentencia = c.createStatement();
			String sql = "SELECT * FROM sqlite_master where type = \"table\";";
			ResultSet result = sentencia.executeQuery(sql);
			ResultSetMetaData rsmd = result.getMetaData();
			int columnsNumber = rsmd.getColumnCount();
			while (result.next()) {
				tablas.add(result.getString(2));
				System.out.println(result.getString(2));
			}
			return tablas;
		} catch (SQLException SqlE) {
			System.out.println("No hay tablas para mostrar");
			tablas.add("No hay tablas para mostar");
			return tablas;
		}
	}
	
	/**
	 * This method checks if a BBDD exists with a given name. 
	 * If it does, it connects to it. If it doesn't, it creates one and connect to it
	 * @param name
	 * @throws SQLException 
	 */
	public void checkDB(String name) throws SQLException {
		name = "agenda";
		try {
			Statement sentencia = c.createStatement();
			String sql = "Select * from " + name + ";";
			sentencia.execute(sql);
		} catch (SQLException sqle) {
			System.out.println("La tabla " + name + "no existe");
			createDB(name);
		}
	}
	
	
	public String createDB(String name) {
		try {
			Statement sentencia = c.createStatement();
			String sql = "Create table " + name + "("
					+ "nombre varchar(15),"
					+ "apellido varchar(15),"
					+ "telefono varchar(9)"
					+ ");";
			sentencia.executeUpdate(sql);
			sentencia.close();
			return "Se ha creado con exito la tabla " + name;
		} catch (SQLException SQLE) {
			return "La tabla " + name + " ya existe o se ha producido un error durante su creación.";
		}
	}
	
	public void cerrar() throws SQLException {
		c.close();
	}
}
