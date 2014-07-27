package xml.reader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/*
 * This XmlReader class are using DOM parser to read data from XML.
 */

public class XmlReader {
	String path = "/Users/Anwara Begum/workspace/InClassCodingExam/src/xml/reader/data.xml";
	
	//String path = "/Users/mrahman/Documents/workspace/InClassCodingExam/src/xml/reader/data.xml";
	
	public XmlReader(FileReader fr) {
		// TODO Auto-generated constructor stub
	}

	public List<Student> parseData(String tagName) throws ParserConfigurationException, SAXException, IOException{
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	DocumentBuilder builder = factory.newDocumentBuilder();
	File file = new File(path);
	Document doc = builder.parse(file);
	NodeList nodeList = doc.getDocumentElement().getChildNodes();
	List<Student> list = new ArrayList<>();
	for(int i=0;i<nodeList.getLength(); i++){
		Node node = nodeList.item(i);
		if(node instanceof Element){
			Student student = new Student();
			student.id = node.getAttributes().getNamedItem(tagName).getNodeValue();
			NodeList childNodes = node.getChildNodes();
			for(int j=0;j<childNodes.getLength();j++){
				Node cNode = childNodes.item(j);
				if(cNode instanceof Element){
					String content = cNode.getLastChild().getTextContent().trim();
					String data = cNode.getNodeName();
					switch(data){
					case "firstName":
						student.firstName = content;
						break;
					case "lastName":
						student.lastName = content;
						break;
					case "score":
						student.score = content;  
						break;	
					}
				}
			}
			list.add(student);
		}
		
	 }
	return list;		
  }
	
	public void Score()
{
       int score = 0;
	 if (score>=90 && score<=100)
	 {
		 System.out.println("Grade A");
	 }
	 
	 if (score>=80 && score<=89)
	 {
		 System.out.println("Grade B");
	 }
	 if (score>=70 && score<=79)
	 {
		 System.out.println("Grade C");
		 
	 }
	 
}

	 
		 
	
	

	
	
	


	
}

