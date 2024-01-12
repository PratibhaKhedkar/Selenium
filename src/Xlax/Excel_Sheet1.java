package Xlax;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_Sheet1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("G:\\poi-bin-5.2.3-20220909\\MyFile.xlsx");
		String data = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from Sheet1:"+data);
		
		FileInputStream file2=new FileInputStream("G:\\poi-bin-5.2.3-20220909\\MyFile.xlsx");
		String data2 = WorkbookFactory.create(file2).getSheet("Sheet2").getRow(1).getCell(1).getStringCellValue();
		System.out.println("Data from Sheet2:"+data2);
		
		FileInputStream file3=new FileInputStream("G:\\poi-bin-5.2.3-20220909\\MyFile.xlsx");
		String data3 = WorkbookFactory.create(file3).getSheet("Sheet2").getRow(2).getCell(2).getStringCellValue();
		System.out.println("Data from Sheet2:"+data3);
		
		

	}

}
