/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package saxdemo1;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/**
 *
 * @author khang
 */
class SaxHandler extends DefaultHandler {

    ArrayList<Book> books;

    public SaxHandler() {
        books = new ArrayList<>();
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("characters: " + new String(ch, start, length));
      
        switch (currentElement) {
            case "Name":
                b.setName(new String(ch, start, length));
                break;
            case "Author":
                b.setAuthor(new String(ch, start, length));
                break;
            case "Price":
                b.setPrice(Float.parseFloat(new String(ch, start, length)));
                break;
        }
        currentElement= "";
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        super.endElement(uri, localName, qName); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("endElement: " + uri + " - " + localName + " - " + qName);
        if (localName.equals("Book")) {
            books.add(b);
        }
    }
    Book b;
    String currentElement = "";

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        super.startElement(uri, localName, qName, attributes); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("startElement: " + uri + " - " + localName + " - " + qName + " - " + attributes.toString());
        currentElement = localName;
        if (localName.equals("Book")) {
            b = new Book();
            b.setCategory(attributes.getValue("Category"));
            b.setNameSpace(uri);
        }

    }

    @Override
    public void endDocument() throws SAXException {
        super.endDocument(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("End Document");
    }

    @Override
    public void startDocument() throws SAXException {
        super.startDocument(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Start Document");
    }

}
