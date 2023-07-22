package ExcelSheet;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class String_1
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file =new FileInputStream("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		
		
		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(value);
		
		
		//Workbook book = WorkbookFactory.create(file);
		//Sheet sh = book.getSheet("Sheet1");
		//Row rw = sh.getRow(0);
		//Cell cl = rw.getCell(1);
		//String value = cl.getStringCellValue();
		//System.out.println(value);
		
	}
	
}
