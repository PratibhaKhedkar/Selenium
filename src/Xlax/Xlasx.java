package Xlax;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Xlasx {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream myfile=new FileInputStream("G:\\poi-bin-5.2.3-20220909\\MyFile.xlsx");
		
				String Value1 = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
				
				System.out.println("xlx output :"+Value1);
				
	}

}
