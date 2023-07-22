package Print_All_Data_In_A_Row;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_5 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file= new FileInputStream("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		int cellindex = sh.getRow(0).getLastCellNum()-1;
		
		for(int i=0;i<=cellindex;i++)
		{
			String value = sh.getRow(0).getCell(i).getStringCellValue();
			
			System.out.print(value+",");
		}
	}
}
