package dwailiPracsel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel_hetrogenious {

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
				CellType type_cell = mysheet.getRow(i).getCell(j).getCellType();
				if(type_cell==CellType.STRING) 
				{
					System.out.println(mysheet.getRow(i).getCell(j).getStringCellValue());
					System.out.print("  ");
				}
				else if(type_cell==CellType.NUMERIC)
				{
					System.out.print(mysheet.getRow(i).getCell(j).getNumericCellValue());
					System.out.print("  ");
				}
				else if(type_cell==CellType.BOOLEAN)
				{
					System.out.print(mysheet.getRow(i).getCell(j).getBooleanCellValue());
					System.out.print("  ");
				}
				System.out.println();
				
			}
			System.out.println();
		}

	}

}
