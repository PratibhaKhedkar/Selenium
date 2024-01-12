package dwailiPracsel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelSheet_homog {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("G:\\poi-bin-5.2.3-20220909\\MyFile.xlsx");
		Sheet mysheet=WorkbookFactory.create(file).getSheet("Sheet3");
		int total_rows=mysheet.getLastRowNum();
		short noofcell=mysheet.getRow(0).getLastCellNum();
		int total_cells=noofcell-1;
		
		for (int i=0; i<=total_rows; i++)
		{
			for(int j=0; j<=total_cells; j++)
			{
				System.out.print(mysheet.getRow(i).getCell(j).getStringCellValue());
				System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
