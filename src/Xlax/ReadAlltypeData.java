package Xlax;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

//import javax.imageio.stream.FileImageInputStream;

public class ReadAlltypeData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("G:\\poi-bin-5.2.3-20220909\\MyFile.xlsx");
		Sheet mysheet = WorkbookFactory.create(file).getSheet("Sheet2");
		int totalRows=mysheet.getLastRowNum();
		short totalNoofcells=mysheet.getRow(0).getLastCellNum();
		int totalcells=totalNoofcells-1;
		
		for(int i=0; i<=totalRows; i++)
		{
			for(int j=0; j<=totalcells; j++)
			{
				CellType data_type=mysheet.getRow(i).getCell(j).getCellType();
				
				if(data_type==CellType.STRING)
				{
					String data_string = mysheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(data_string);
				}
				else if(data_type==CellType.BOOLEAN)
				{
				 boolean data_boolean= mysheet.getRow(i).getCell(j).getBooleanCellValue();
					System.out.print(data_boolean);
				}
				else if(data_type==CellType.NUMERIC)
				{
				double data_Numric = mysheet.getRow(i).getCell(j).getNumericCellValue();
					System.out.print(data_Numric);
				}
				System.out.print("  ");
			}
			System.out.println();
		}
		
		

	}

}
