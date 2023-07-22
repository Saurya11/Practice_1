package POM_With_DDF;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwagLabLoginTest_1
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		FileInputStream file=new FileInputStream("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\3rd Sep batch sel setup\\ExcelSheet.xlsx");
		
     	Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
     	
     	SwagLabLoginPage_1 login=new SwagLabLoginPage_1(driver);
     	
        String UNvalue = sh.getRow(0).getCell(0).getStringCellValue();
     	login.inpSwagLabLoginPageUN(UNvalue);
     	
     	String PWDvalue = sh.getRow(0).getCell(1).getStringCellValue();
     	
     	login.inpSwagLabLoginPagePWD(PWDvalue);
     	
     	Thread.sleep(3000);
     	
     	login.clickSwagLabLoginPagelogbtn();
     	
     	Thread.sleep(3000);
     	
     	SwagLabHomePage_1 home=new SwagLabHomePage_1(driver);
     	
     	home.verifySwagLabHomePagelogo();
     	
     	Thread.sleep(3000);
     	
     	home.clickSwagLabHomePagecart();
     	
     	Thread.sleep(3000);
     	
     	home.getSwagLabHomePageremove();
     	
     	Thread.sleep(3000);
     	
     	home.clickSwagLabHomePagemain();
     	
     	Thread.sleep(3000);
     	
     	SwagLabMenuPage_1 main=new SwagLabMenuPage_1(driver);
     	
     	Thread.sleep(3000);
     	
     	main.clickSwagLabMenuPagelog();
     	
     	Thread.sleep(3000);
     	
     	driver.close();
		
	}

}
