package Print_All_Data_In_A_Sheet_11;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Demo_3 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet5");
		
		int rowindex = sh.getLastRowNum();
		
		for(int i=0;i<=rowindex;i++)         //outer loop for column
		{
			int cellindex = sh.getRow(i).getLastCellNum()-1;
			for(int j=0;j<=cellindex;j++)    //inner loop for row
			{
				Cell cellinfo = sh.getRow(i).getCell(j);
				CellType f1 = cellinfo.getCellType();
				if(f1==CellType.STRING)
				{
					String value = cellinfo.getStringCellValue();
					System.out.print(value+" ");
				}
				else if(f1==CellType.NUMERIC)
				{
					double value = cellinfo.getNumericCellValue();
					System.out.print(value+" ");
				}
				else if(f1==CellType.BOOLEAN)
				{
					boolean value = cellinfo.getBooleanCellValue();
					System.out.print(value+" ");
				}
			}
			System.out.println();
			
		}
		
	}

}
