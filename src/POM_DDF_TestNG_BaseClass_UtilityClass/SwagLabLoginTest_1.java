package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabLoginTest_1 extends BaseClass_1
{
	SwagLabLoginPage_1 login;
	SwagLabHomePage_1 home;
	SwagLabMenuPage_1 menu;
	@BeforeClass
	public void openbrowser()
	{
		initializebrowser();
		login=new SwagLabLoginPage_1(driver);
		home=new SwagLabHomePage_1(driver);
		menu=new SwagLabMenuPage_1(driver);
		
	}
	@BeforeMethod
	public void logintoapp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		login.inpSwagLabLoginPageUN(UtilityClass_1.getTD(0, 0));
		
		Thread.sleep(2000);
		login.inpSwagLabLoginPagePWD(UtilityClass_1.getTD(0, 1));
		
		Thread.sleep(2000);
		login.clickSwagLabLoginPagelogin();
	}
	@Test(priority = 1)
	public void verifylogo() throws InterruptedException
	{
		Thread.sleep(2000);
		boolean actresult = home.getSwagLabHomePagelogo();
		Assert.assertTrue(actresult, "failed-result not match");
	}
	@Test(priority = 2)
	public void getremovetext() throws InterruptedException, EncryptedDocumentException, IOException 
	{
		home.clickSwagLabHomePagecartbtn();
		Thread.sleep(2000);
		String acttext = home.getSwagLabHomePageremovetext();
		String exptext = UtilityClass_1.getTD(0, 2);
		Assert.assertEquals(acttext, exptext,"failed-both result are diff");
		
	}
	@AfterMethod
	public void logoutfromapp() throws InterruptedException
	{
		Thread.sleep(3000);
		home.clickSwagLabHomePagemainbtn();
		Thread.sleep(2000);
		menu.clickSwagLabMenuPagelogoutbtn();
		
		
	}
	@AfterClass
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
		
	}

}
