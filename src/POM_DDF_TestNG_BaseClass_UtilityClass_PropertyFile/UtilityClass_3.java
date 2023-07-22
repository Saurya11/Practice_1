package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass_3 
{
	//@author name=saurabh
	//this method is used to fetch the data from property file
	//it will accept one string parameter i,e.key
	public static String getPFdata(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\eclipse-workspace\\Selenium\\propertfile_1.properties");
		
		Properties p=new Properties();
		
		p.load(file);
		
		String value = p.getProperty(key);
		
		return value;
	}
	//@author name=suraj
	//this methos is used to fetch data from excell sheet
	//it will accept parameter 1-rowindex,2-cellindex 
	public static String testdata(int rowindex,int cellindex) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		
		return value;
	}
	
	public static void capturess(WebDriver driver, int TCID) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest =new File("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\Screenshot\\Test"+TCID+".jpeg");
		
		FileHandler.copy(source, dest);
	}

}
