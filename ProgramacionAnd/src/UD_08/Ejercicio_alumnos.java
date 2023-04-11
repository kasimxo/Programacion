package UD_08;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Ejercicio_alumnos {

	public static void main(String[] args) {
		
		String filePath = new File("").getAbsolutePath();
		filePath += "\\data\\alumnos.xml";
		System.out.println(filePath);
		
		//File file = new File("C:\\Users\\Alumno\\git\\ProgramacionAnd\\ProgramacionAnd\\data\\alumnos.xml");
		File file = new File(filePath);
		
		try {
			
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            
            doc.getDocumentElement().normalize();
            
            NodeList listaAlumnos = doc.getElementsByTagName("alumno");
            System.out.println("Número de alumnos: " + listaAlumnos.getLength());
            
            for(int i = 0; i < listaAlumnos.getLength(); i++) {
            	
                Node alumno = listaAlumnos.item(i);

                if(alumno.getNodeType() == Node.ELEMENT_NODE) {
                  Element eElement = (Element) alumno;

                  System.out.println("\nId del alumno: " + eElement.getAttribute("id"));
                  System.out.println("Nombre: "
                              + eElement.getElementsByTagName("nombre").item(0).getTextContent());
                  System.out.println("edad: "
                              + eElement.getElementsByTagName("edad").item(0).getTextContent());
                }
              }
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
