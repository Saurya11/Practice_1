package Print_All_Data_In_A_Col_11;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_1
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		
		int lastrowindex = sh.getLastRowNum();
		
		for(int i=0;i<=lastrowindex;i++)
		{
			Cell rowinfo = sh.getRow(i).getCell(0);
			CellType f1 = rowinfo.getCellType();
			if(f1==CellType.STRING)
			{
				String value = rowinfo.getStringCellValue();
				System.out.println(value);
			}
			else if(f1==CellType.NUMERIC)
			{
				double value = rowinfo.getNumericCellValue();
				System.out.println(value);
				
			}
			else if(f1==CellType.BOOLEAN)
			{
				boolean value = rowinfo.getBooleanCellValue();
				System.out.println(value);
			}
		}
	}
	

}
