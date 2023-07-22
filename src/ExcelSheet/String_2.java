package ExcelSheet;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class String_2
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
	//	Workbook f1 = WorkbookFactory.create(file);
	//	Sheet sh = f1.getSheet("Sheet2");
	//	Row rowindex = sh.getRow(0);
	//	Cell cellindex = rowindex.getCell(0);
	//	String value = cellindex.getStringCellValue();
	//	System.out.println(value);
		
		String value = WorkbookFactory.create(file).getSheet("Sheet2").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
	}

}
