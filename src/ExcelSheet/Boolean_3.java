package ExcelSheet;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Boolean_3 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		
//		boolean value = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(2).getBooleanCellValue();
//
//		System.out.println(value);
//		
	   Workbook work = WorkbookFactory.create(file);
	   
	   Sheet sh = work.getSheet("sheet1");
	   
	   Row row = sh.getRow(0);
	   
	   Cell cell = row.getCell(2);
	   
	  boolean value = cell.getBooleanCellValue();
	  
	  System.out.println(value);
		
	}

}
