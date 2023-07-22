package POM_DDF_TestNg;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabLoginTest_1 
{
	WebDriver driver;
	Sheet sh;
	SwagLabLoginPage_1 login;
	SwagLabHomePage_1 home;
	SwagLabMenuPage_1 menu;
	
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		 sh = WorkbookFactory.create(file).getSheet("DDF");
		 
		  driver=new EdgeDriver();
		  
		  driver.get("https://www.saucedemo.com/");
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  
		  login=new SwagLabLoginPage_1(driver);
		  home=new SwagLabHomePage_1(driver);
		  menu=new SwagLabMenuPage_1(driver);
		 
		
	}
	@BeforeMethod
	public void logintoapp() throws InterruptedException
	{
		Thread.sleep(3000);
		login.inpSwagLabLoginPageUN(sh.getRow(0).getCell(0).getStringCellValue());
		login.inpSwagLabLoginPagePWd(sh.getRow(0).getCell(1).getStringCellValue());
		Thread.sleep(3000);
		login.clickSwagLabLoginPagelogin();
		Thread.sleep(3000);
	}
	@Test
	public void Verifylogo()
	{
		//home.getverifySwagLabHomePagelogoresult();
	boolean actresult = home.getverifySwagLabHomePagelogoresult();
	Assert.assertTrue(actresult,"failed-actresult id false");
		
	}
	@Test
	public void verifylogoremove() throws InterruptedException
	{
		home.clickSwagLabHomePagecart();
		
		Thread.sleep(2000);
		
		String acttext = home.getSwagLabHomePageremovebtn();
		String expresult = sh.getRow(0).getCell(2).getStringCellValue();
		Assert.assertEquals(acttext,expresult,"failed-both result are diff");
	}
	@AfterMethod
	public void logoutfromapp() throws InterruptedException
	{
		home.clickSwagLabHomePagemenu();
		Thread.sleep(3000);
		menu.clickSwagLabMenuPagelog();
		
		Thread.sleep(3000);
	}
	@AfterClass
	public void closebrowser()
	{
		driver.quit();
		
		
	}
	
}
