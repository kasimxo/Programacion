package UD_08;
import java.io.*;

import javax.xml.parsers.*;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Ejercicio_pole {

	public static void main(String[] args) {
		
		FileReader fr;
		
		try {
			
			 String filePath = new File("").getAbsolutePath();
			 fr = new FileReader(filePath+"\\data\\Pole.txt");
			 
			 DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			 DocumentBuilder db = dbf.newDocumentBuilder();
	         Document doc = db.newDocument();
			 
			 BufferedReader br = new BufferedReader(fr);
			 
			 String linea = br.readLine();
			 
			 Element raiz = doc.createElement("pilotos");
			 doc.appendChild(raiz);
			 
			 
			 while(linea!=null) {
				 String[] splited = linea.split("::");
				 
				 Element pilot = doc.createElement("piloto");
				 raiz.appendChild(pilot);
				 //@pos
				 Attr pos = doc.createAttribute("posicion");
				 pos.setValue(splited[0]);
				 pilot.setAttributeNode(pos);
				 //nombre
				 Element nombre = doc.createElement("nombre");
				 nombre.setTextContent(splited[1]);
				 pilot.appendChild(nombre);
				 //escuderia
				 Element escuderia = doc.createElement("escuderia");
				 escuderia.setTextContent(splited[2]);
				 pilot.appendChild(escuderia);
				 //coche
				 Element coche = doc.createElement("coche");
				 coche.setTextContent(splited[3]);
				 pilot.appendChild(coche);
				 //circuito
				 Element circuito = doc.createElement("circuito");
				 circuito.setTextContent(splited[4]);
				 pilot.appendChild(circuito);
				 //año
				 Element anyo = doc.createElement("anyo");
				 anyo.setTextContent(splited[5]);
				 pilot.appendChild(anyo);
				 //velocidad
				 Element vel = doc.createElement("velocidad");
				 
				// clases necesarias finalizar la creación del archivo XML
	            TransformerFactory transformerFactory = TransformerFactory.newInstance();
	            Transformer transformer = transformerFactory.newTransformer();
	            //lo pongo bonito insertando saltos de línea al final de cada línea
	            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	            //Añadir 3 espacios delante, en función del nivel de cada nodo
	            //transformer.setOutputProperty(OutputPropertiesFactory.S_KEY_INDENT_AMOUNT, "3");
	            
	            DOMSource source = new DOMSource(doc);
	            StreamResult result = new StreamResult(new File("C:\\Users\\Alumno\\git\\ProgramacionAnd\\ProgramacionAnd\\data\\Poles.xml"));

	            transformer.transform(source, result);
				 
				 
				 linea=br.readLine();
			 }
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
