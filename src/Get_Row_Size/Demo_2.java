package Get_Row_Size;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream file= new FileInputStream("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		
		int getrowsize = WorkbookFactory.create(file).getSheet("Sheet2").getLastRowNum()+1;
		
		System.out.println(getrowsize);
	}

}
