package homework_15.Task_1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class Parser {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        SAXParserFactory parserFactory = SAXParserFactory.newInstance();
        SAXParser parser = parserFactory.newSAXParser();

        SAXHandler handler = new SAXHandler();
        InputStream resource = ClassLoader.getSystemResourceAsStream("hwrk_15/hmrk/xml/students.xml");
        parser.parse(resource, handler);

        List<Students> studentsList = handler.getEmpList();

        studentsList.forEach(student -> System.out.println(student));

    }
}

class SAXHandler extends DefaultHandler {
    private List<Students> empList = new ArrayList<>();
    private Students emp = null;
    private String content = null;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        switch (qName) {
            case "student":
                emp = new Students();
                empList.add(emp);
                break;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) {
        switch (qName) {
            case "firstName":
                emp.setFirstName(content);
                break;
            case "lastName":
                emp.setLastName(content);
                break;
            case "course":
                emp.setCourse(content);
                break;
            case "faculty":
                emp.setFaculty(content);
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) {
        content = String.copyValueOf(ch, start, length).trim();
    }

    public List<Students> getEmpList() {
        return empList;
    }
}

