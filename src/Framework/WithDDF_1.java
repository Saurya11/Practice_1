package Framework;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WithDDF_1
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(username);
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		boolean result = driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
		
		if(result==true)
		{
			System.out.println("logo present-->test case pass");
		}
		
		else
		{
			System.out.println("logo not present-->test case fail");
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	}

}
