package Print_All_Data_In_A_Row;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_3 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
		
		int getcellindex = sh.getRow(1).getLastCellNum()-1;
		
		for(int i=0;i<=getcellindex;i++)
		{
			String value = sh.getRow(1).getCell(i).getStringCellValue();
			System.out.print(value+" ");
		}
	}

}
