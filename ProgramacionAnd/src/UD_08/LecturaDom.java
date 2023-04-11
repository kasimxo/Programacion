package UD_08;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class LecturaDom {
    
    public static void main(String[] args) {
        
    	String filePath = new File("").getAbsolutePath();
    	filePath += "\\data\\versiones.xml";
    	File file = new File(filePath);
        
        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(file);
            
            // estos métodos podemos usarlos combinados para normalizar el archivo XML
            doc.getDocumentElement().normalize();
            
            // almacenamos los nodos para luego mostrar la
            // cantidad de ellos con el método getLength()
            NodeList nList = doc.getElementsByTagName("version");
            System.out.println("Número de versiones: " + nList.getLength());
            
            for(int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);

                if(nNode.getNodeType() == Node.ELEMENT_NODE) {
                  Element eElement = (Element) nNode;

                  System.out.println("\nVersion id: " + eElement.getAttribute("numero"));
                  System.out.println("Nombre: "
                              + eElement.getElementsByTagName("nombre").item(0).getTextContent());
                  System.out.println("api: "
                              + eElement.getElementsByTagName("api").item(0).getTextContent());
                }
              }
            
          } catch(Exception e) {
            e.printStackTrace();
          }
    }
    
}