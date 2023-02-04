

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import java.util.Arrays;

public class CustomEH extends DefaultHandler {

    private StringBuffer sb;

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Inicio del documento");
    }

    @Override
    public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
        if (qName.equals("estudiante"))     
            sb = new StringBuffer();
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if (sb != null)
            sb.append(Arrays.copyOfRange(ch, start, start+length));
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equals("estudiante"))     
            System.out.println(sb);
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("Final del documento");
    }
}
