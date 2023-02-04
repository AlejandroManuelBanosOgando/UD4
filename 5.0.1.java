

import java.io.IOException;
import org.xml.sax.SAXException;
import org.w3c.dom.*;
import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;

public class AnalizadorDOM {

    private static void foo(Document d) {

        Element root = d.getDocumentElement();                      
        NodeList librosList = root.getElementsByTagName("estudiante");     

        for(int i = 0; i < librosList.getLength(); i++) {

            Element e = (Element) librosList.item(i);                 
            System.out.println(e.getTextContent().trim());      	
        }
    }

    public static void main(String[] args) throws ParserConfigurationException {

        File myFile = new File("L:/LinguaxesDeMarcas/LMSXI/UD5/actividad_5_0_1/", "mixml.xml");
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();

        db.setErrorHandler(new CustomEH());
        try {
            Document doc = db.parse(myFile);
            foo(doc);

        } catch (SAXException | IOException e) { e.printStackTrace(); }
    }

}
