package propertiesTest;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("C:\\Users\\user\\git\\maven_new\\My_Maven\\src\\main\\resources\\test.properties");
		Properties p = new Properties();
		p.load(fr);
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("pwd"));
		p.setProperty("email", "aparna@gmail.com");
		FileWriter fw =  new FileWriter("C:\\Users\\user\\git\\maven_new\\My_Maven\\src\\main\\resources\\test.properties");
		p.store(fw,"commit");
		//p.store(new FileWriter("info properties"), null);
		Properties p1= new Properties();
		p1.setProperty("phn", "33333");
		p1.store(new FileWriter("info properties"), null);
	}

}
