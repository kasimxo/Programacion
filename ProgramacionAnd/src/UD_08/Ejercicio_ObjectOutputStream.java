package UD_08;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ejercicio_ObjectOutputStream {

	public static void main(String[] args) {

		
		String archivo = "D:\\datos.dat";
		File f = new File(archivo);
		
		
		
		try {
			
			//Aquí generamos los objetos que mas tarde vamos a guardar en un archivo
			User u1 = new User(01, "HackerOscuro", "1234");
			User u2 = new User(02, "Isildur","34CacaHuete");
			ArrayList<User> lista = new ArrayList();
			lista.add(u1);
			lista.add(u2);
			
			if(!f.exists()) {
				//Aquí es donde creamos el objectOutputStream
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo));
				
				//Aquí guardamos directamente la lista
				oos.writeObject(lista);
				//También podríamos guardar un único objeto si quisieramos
				//oos.writeObject(u2);
				
				oos.close();
				
			}else {
				MyObjectOutputStream oos = new MyObjectOutputStream(new FileOutputStream(archivo));
				oos.writeObject(u1);
				oos.writeObject(u2);
				
				oos.close();
			}
			
			
			User u3 = new User(03,"Pedro","Picapiedra");
			
			if(!f.exists()) {
				ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo,true));
				oos.writeObject(u3);
				
				oos.close();
			}else {
				MyObjectOutputStream oos = new MyObjectOutputStream(new FileOutputStream(archivo,true));
				oos.writeObject(u3);
				
				oos.close();
			}
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			//Aquí leemos los objetos del archivo
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivo));
			
			while(true) {
				//User aux = (User) ois.readObject();
				System.out.println(ois.readObject());
				//ArrayList<User> lista = (ArrayList<User>) ois.readObject();
				
				//System.out.println(aux);
			}
			
		} catch (EOFException e) {
			System.out.println("Ya no hay mas.");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		f.delete();
	}

}

