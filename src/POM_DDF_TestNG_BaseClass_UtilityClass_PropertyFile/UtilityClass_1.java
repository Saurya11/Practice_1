package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityClass_1
{
	//this method is used to fetch the data from property file
	//it need to accept 1 parameter
	public static String getPFdata(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\eclipse-workspace\\Selenium\\Propertyfile.Properties");
		
		Properties p=new Properties();
		
		p.load(file);
		
		String value = p.getProperty(key);
		
		return value;
	}
	
	//author name;saurabh
	//this method method is used to fetch the excell data
	//need 2 parameter 1-rowindex,2-cellindex
	public static String testdata(int rowindex,int cellindex) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		
		 Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		 
		String value = sh.getRow(rowindex).getCell(cellindex).getStringCellValue();
		
		return value;
		
	}
	
	public static void cpaturess(WebDriver driver,int TCN) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\Screenshot\\test"+TCN+".jpeg");
		
		FileHandler.copy(source, dest);
	}
	public static void getScreenShot(WebDriver driver) throws IOException
	{
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\Screenshot\\screen_1.jpeg");
		
		FileHandler.copy(source, dest);

	}
}
