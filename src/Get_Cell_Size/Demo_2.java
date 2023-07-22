package Get_Cell_Size;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_2 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		
		short getcellsize = WorkbookFactory.create(file).getSheet("Sheet2").getRow(1).getLastCellNum();
		
		System.out.println(getcellsize);
		
	}

}
