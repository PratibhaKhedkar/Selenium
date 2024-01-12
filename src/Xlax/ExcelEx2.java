package Xlax;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelEx2 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		FileInputStream myfile= new FileInputStream("G:\\poi-bin-5.2.3-20220909\\MyFile.xlsx");
		Workbook myworkbook=WorkbookFactory.create(myfile);
		
		 Sheet mysheet = myworkbook.getSheet("Sheet3");
		 
		 for(int i=0; i<=2; i++)
		 {
			 String value = mysheet.getRow(0).getCell(i).getStringCellValue();
			 System.out.println(value+" ");
		 }
		 System.out.println();
		 System.out.println("=======================");
		 
		 for(int i=0; i<=2; i++)
		 {
			 String value = mysheet.getRow(i).getCell(0).getStringCellValue();
			 System.out.println(value+" ");
			 
		 }
		 System.out.println();
		 System.out.println("=======================");
		 
		 
		 Sheet mysheet2 = myworkbook.getSheet("Sheet2");
		 
		 for(int i=0; i<=1; i++)
			 
		 {
			 for(int j=0; j<=2; j++)
			 {
				 String value = mysheet2.getRow(i).getCell(j).getStringCellValue();
				 System.out.print(value+" ");
				 
			 }
			System.out.println();
		 }
		

	}

}
