package ExcelSheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Integer_3 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		
//		Workbook work = WorkbookFactory.create(file);
//		
//		Sheet sh = work.getSheet("sheet1");
//		
//		Row row = sh.getRow(0);
//		
//		Cell cell = row.getCell(0);
//		
//		double value = cell.getNumericCellValue();
//		
//		System.out.println(value);
//		
		double num = WorkbookFactory.create(file).getSheet("sheet1").getRow(0).getCell(0).getNumericCellValue();
		
		System.out.println(num);
	}

}
