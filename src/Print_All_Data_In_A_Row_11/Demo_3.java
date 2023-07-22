package Print_All_Data_In_A_Row_11;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_3
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		
		int rowindex = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=rowindex;i++)
		{
			Cell cellinfo = sh.getRow(0).getCell(i);
			CellType s1 = cellinfo.getCellType();
			if(s1==CellType.STRING)
			{
				String value = cellinfo.getStringCellValue();
				System.out.print(value+" ");
			}
			else if(s1==CellType.NUMERIC)
			{
				double value = cellinfo.getNumericCellValue();
				System.out.print(value+" ");
			}
			else if(s1==CellType.BOOLEAN)
			{
				boolean value = cellinfo.getBooleanCellValue();
				System.out.print(value+" ");
			}
		}
		
	}

}
