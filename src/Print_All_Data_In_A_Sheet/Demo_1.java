package Print_All_Data_In_A_Sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_1 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		
	    Sheet sh = WorkbookFactory.create(file).getSheet("Sheet3");
	    
	   int lastrowindex = sh.getLastRowNum();
	   
	   for(int i=0;i<=lastrowindex;i++)            //outer loop for row
	   {
		   int lastcellindex = sh.getRow(i).getLastCellNum()-1;
		   for(int j=0;j<=lastcellindex;j++)         //inner loop for column
		   {
			  String value = sh.getRow(i).getCell(j).getStringCellValue();
			  
			  System.out.print(value+" ");
		   }
		   System.out.println();
	   }
		
	}

}
