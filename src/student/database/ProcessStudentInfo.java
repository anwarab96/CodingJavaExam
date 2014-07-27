package student.database;

import java.io.FileReader;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import xml.reader.XmlReader;

public class ProcessStudentInfo {

		/*
		 * Under XmlReader class, the parseData() will return list of Student Info which will contain Student first name, last name and score.
		 * You need to write a method which will convert score into Grade in letter('A'for90 to 100,'B'for 80 to 89 and 
		 * 'C' for 70 to 79.Then print this to the console.
		 * Do any necessary steps that require for below successful output.
		 * .................................................
		 * Student (id= 1) "Marc" "Carp"   Grade= B
		 * Student (id= 2) "Israt" "Khan"   Grade= A
		 * Student (id= 3) "Mohi" "Uddin"   Grade= A
		 * Student (id= 4) "Abrar" "Hossain"   Grade= B
		 * Student (id= 5) "Abida" "Sultana"   Grade= B
		 * .................................................
		 * 
		 * 
		 */
	 /*
	public void Score()
	{
		int score = 0;
		 if (score>=90 && score<=100)
		 {
			 System.out.println("Grade = A");
		 }
		 
		 if (score>=80 && score<=89)
		 {
			 System.out.println("Grade = B");
		 }
		 if (score>=70 && score<=79)
		 {
			 System.out.println("Grade = C");
			 
		 */
		 
	
			public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
				FileReader fr = null;
				fr = new FileReader("C:\\Users\\Anwara Begum\\workspace\\InClassCodingExam\\src\\xml\\reader\\data.xml");
			 @SuppressWarnings("unused")
			XmlReader xr = new XmlReader(fr);
		
			 System.out.println(90);
			}
			

}


