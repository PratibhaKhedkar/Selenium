package proppackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		//create object of properties
		
		Properties prop = new Properties();
		
		//create object of FileInputStream
		
		FileInputStream myfile= new FileInputStream("G:\\poi-bin-5.2.3-20220909\\Temp.xlsx");

		//Sheet mySheet = WorkbookFactory.create(myfile).getSheet("CoverFox");

		
		
		prop.load(myfile);
		
		String value1 = prop.getProperty("age");
		String value2 = prop.getProperty("pin");
		String value3 = prop.getProperty("mob");
		String value4 = prop.getProperty("state");
		
		System.out.println("Student age "+value1);
		System.out.println("pincode "+value2);
		System.out.println("mobile number "+value3);
		System.out.println("state "+value4);

	}

}
