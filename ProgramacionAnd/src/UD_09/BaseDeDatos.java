package UD_09;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDeDatos {
	
	private Connection con;
	private Statement sent;
	private String sql;
	
	public BaseDeDatos() throws SQLException {
		//Con esto nos conectamos a la bbdd
		this.con = DriverManager.getConnection("jdbc:sqlite:D:\\sqlite\\andres.db");
		System.out.println("Conexión establecida.");
		this.sent = con.createStatement();
		this.sql = "";
	}
	
	
	public void mostrarTabla() {
		System.out.println("¿Qué tabla quieres ver? \n1 - Empleados\n2 - Provincias\n3 - Localidades");
		int sel = Leer.leerInt();
		switch(sel) {
		case 0:
			return;
		case 1:
			mostrarEmpleados();
			break;
		case 2:
			mostrarProvincias();
			break;
		case 3:
			mostrarLocalidades();
			break;
		}
	}
	
	private void mostrarLocalidades() {
		this.sql = "Select * from localidades";
		
		try {
			ResultSet resultado = sent.executeQuery(sql);
			while(resultado.next()) {
				System.out.printf("%4d %15s %4d\n",resultado.getInt(1),resultado.getString(2),resultado.getInt(3));
			}
		} catch (SQLException e) {
			System.out.println("No se ha podido recuperar la información.");
			e.printStackTrace();
		}	
	}


	private void mostrarProvincias() {
		this.sql = "Select * from provincias";
		
		try {
			ResultSet resultado = sent.executeQuery(sql);
			while(resultado.next()) {
				System.out.printf("%4d %15s\n",resultado.getInt(1),resultado.getString(2));
			}
		} catch (SQLException e) {
			System.out.println("No se ha podido recuperar la información.");
			e.printStackTrace();
		}		
	}


	private void mostrarEmpleados() {
		this.sql = "Select * from empleados";
		
		try {
			ResultSet resultado = sent.executeQuery(sql);
			while(resultado.next()) {
				System.out.printf("%4d %15s %15s %15s %9d %15s %5d %5d\n",resultado.getInt(1),resultado.getString(2),resultado.getString(3),resultado.getInt(4),resultado.getInt(5),resultado.getString(6),resultado.getInt(7),resultado.getInt(8) );
			}
		} catch (SQLException e) {
			System.out.println("No se ha podido recuperar la información.");
			e.printStackTrace();
		}
	}


	public void insertEmpleado() {
		System.out.println("Introduce el ID del nuevo empleado: ");
		int id = Leer.leerInt();
		System.out.println("Introduce el nombre del nuevo empleado: ");
		String nombre = Leer.leerString();
		System.out.println("Introduce el apellido del nuevo empleado: ");
		String apellido = Leer.leerString();
		System.out.println("Introduce la localidad del nuevo empleado: ");
		String loc = Leer.leerString();
		System.out.println("Introduce el teléfono del nuevo empleado: ");
		int tlf = Leer.leerInt();
		System.out.println("Introduce la dirección del nuevo empleado: ");
		String dir = Leer.leerString();
		System.out.println("Introduce el salario del nuevo empleado: ");
		int sal = Leer.leerInt();
		int ant = 0;
		
		try {
			int tuplas = sent.executeUpdate("Insert into empleados values(" + id+",\"" + nombre+"\",\"" + apellido+"\",\"" + loc+"\"," + tlf+",\"" + dir+"\"," + sal+"," + ant+")");
			System.out.println("Se ha registrado con éxito el nuevo empleado.");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public void eliminarEmpleado() {
		System.out.println("Introduce el Id del empleado que quieres eliminar: ");
		int id = Leer.leerInt();
		
		this.sql = "Select * from empleados";
		
		try {
			ResultSet resultado = sent.executeQuery(sql);
			while(resultado.next()) {
				if(resultado.getInt(1)==id) {
					sent.executeUpdate("delete from empleados where id ="+id);
					System.out.println("Se ha eliminado el empleado");
				}
			}
		} catch (SQLException e) {
			System.out.println("No se ha podido eliminar el empleado.");
			e.printStackTrace();
		}
		
	}


	public void actualizarSueldo() {
		System.out.println("Introduce el Id del empleado al que le quieres actualizar el sueldo: ");
		int id = Leer.leerInt();
		System.out.println("Introduce el nuevo salario: ");
		int salario = Leer.leerInt();
		
		this.sql = "Select * from empleados";
		
		try {
			ResultSet resultado = sent.executeQuery(sql);
			while(resultado.next()) {
				if(resultado.getInt(1)==id) {
					sent.executeUpdate("update empleados set salario=" + salario + " where id ="+id);
					System.out.println("Se ha actualizado el salario del empleado con id "+id);
				}
			}
		} catch (SQLException e) {
			System.out.println("No se ha podido actualizar el sueldo del empleado.");
			e.printStackTrace();
		}
	}


	public void sumSueldo() {
		this.sql = "Select sum(salario) from empleados";
		try {
			ResultSet resultado = sent.executeQuery(sql);
			System.out.println("La suma del salario de todos los trabajadores es: " + resultado.getInt(1));
		} catch (SQLException e) {
			System.out.println("No se ha podido recuperar la información.");
			e.printStackTrace();
		}
	}


	public void contarRegistros() {
		System.out.println("¿De qué tabla quieres contar los registros? \n1 - Empleados\n2 - Provincias\n3 - Localidades");
		int sel = Leer.leerInt();
		switch(sel) {
		case 1:
			this.sql = "Select count(*) from empleados";
			try {
				ResultSet resultado = sent.executeQuery(sql);
				System.out.println("El númeor de registros de la tabla empleados es: " + resultado.getInt(1));
			} catch (SQLException e) {
				System.out.println("No se ha podido recuperar la información.");
				e.printStackTrace();
			}
			break;
		case 2:
			this.sql = "Select count(*) from provincias";
			try {
				ResultSet resultado = sent.executeQuery(sql);
				System.out.println("El númeor de registros de la tabla provincias es: " + resultado.getInt(1));
			} catch (SQLException e) {
				System.out.println("No se ha podido recuperar la información.");
				e.printStackTrace();
			}
			break;
		case 3:
			this.sql = "Select count(*) from localidades";
			try {
				ResultSet resultado = sent.executeQuery(sql);
				System.out.println("El númeor de registros de la tabla localidades es: " + resultado.getInt(1));
			} catch (SQLException e) {
				System.out.println("No se ha podido recuperar la información.");
				e.printStackTrace();
			}
			break;
		}
	}

}
