package lenguaje;

import java.io.IOException;
import org.xml.sax.SAXException;
import org.w3c.dom.*;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

public class Ejemplo {

    private static void foo(Document d) {

        Element root = d.getDocumentElement();                      
        NodeList listaLibros = root.getElementsByTagName("libro");     

        for(int i = 0; i < listaLibros.getLength(); i++) {

            Element atributo = (Element) listaLibros.item(i);                  

            if (atributo.getAttribute("digital").equals("true"))           "
                System.out.println(atributo.getTextContent().trim());      
        }
    }


}