package net.osgg.xmlsaxparser;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class CustomHandler extends DefaultHandler {
    boolean id = false;
    boolean lastname= false;
    boolean firstname = false;
    boolean emailId = false;
    int a=0;
    int b=0;

    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
      
        if (qName.equalsIgnoreCase("ID")) {
            id= true;
        }
        if (qName.equalsIgnoreCase("firstname")) {
            firstname = true;
        }
        if (qName.equalsIgnoreCase("lastname")) {
           lastname = true;
        }
        if (qName.equalsIgnoreCase("emailId")) {
        	emailId = true;
        }
      
      
    }
    
    public void endElement(String uri, String localName, String qName) throws SAXException {
       System.out.println("");
    }
    
    public void characters(char ch[], int start, int length) throws SAXException {
       
        if (id) {
            System.out.println("ID:  " + new String(ch, start, length));
            id = false;
        }
        if (firstname) {
            System.out.println("firstname: " + new String(ch, start, length)); 
            firstname = false;
        }
        if (lastname) {
            System.out.println("Lastname : " + new String(ch, start, length));
            lastname = false;
        }
        if (emailId) {
            System.out.println("emailId : " + new String(ch, start, length));
           emailId = false;
        }
        System.out.print("");
       
    }
    
    
}
