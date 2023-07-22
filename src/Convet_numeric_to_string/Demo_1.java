package Convet_numeric_to_string;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");

		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(3).getCell(0).getStringCellValue();
		
		System.out.println(value);
		
	}

}
