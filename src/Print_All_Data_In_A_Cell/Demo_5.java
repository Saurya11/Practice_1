package Print_All_Data_In_A_Cell;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_5 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		int lastindex = sh.getLastRowNum();
		
		System.out.println(lastindex);
		
		for(int i=0;i<=lastindex;i++)
		{
			String value = sh.getRow(i).getCell(0).getStringCellValue();
			
			System.out.println(value);
		}
	}

}
