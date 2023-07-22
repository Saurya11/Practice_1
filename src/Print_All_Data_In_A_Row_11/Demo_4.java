package Print_All_Data_In_A_Row_11;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_4 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		
		int cellindex = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=cellindex;i++)
		{
			Cell cellinfo = sh.getRow(0).getCell(i);
			CellType f1 = cellinfo.getCellType();
			
			if(f1==CellType.STRING)
			{
				String value = cellinfo.getStringCellValue();
				System.out.println(value);
			}
			else if(f1==CellType.NUMERIC)
			{
				double value = cellinfo.getNumericCellValue();
				System.out.println(value);
			}
			else if(f1==CellType.BOOLEAN)
			{
				boolean value = cellinfo.getBooleanCellValue();
				System.out.println(value);
			}
		}
		
	}

}
