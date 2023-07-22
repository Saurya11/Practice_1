package Verify_type_of_Cell;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		
	    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet2");
		
	   CellType value = sh.getRow(0).getCell(0).getCellType();
	   
	   System.out.println(value);
	}

}
