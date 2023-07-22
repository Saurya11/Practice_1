package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabLoginTest_1 extends BaseClass_1
{
	int TCID;
	SwagLabLoginPage_1 login;
	SwagLabHomePage_1 home;
	SwagLabMenuPage_1 menu;
	@BeforeClass
	public void openbrowser() throws IOException
	{
		initializebrowser();
		
		login=new SwagLabLoginPage_1(driver);
		home=new SwagLabHomePage_1(driver);
		menu=new SwagLabMenuPage_1(driver);
	}
	@BeforeMethod
	public void logintoapp() throws IOException, InterruptedException
	{
		login.inpSwagLabLoginPageun(UtilityClass_1.getPFdata("UN"));
		Thread.sleep(1000);
		login.inpSwagLabLoginPagepwd(UtilityClass_1.getPFdata("PWD"));
		Thread.sleep(1000);
		login.clickSwagLabLoginPagelogin();
	}
	@Test(priority = 1)
	public void takescreen() throws IOException
	{
		UtilityClass_1.getScreenShot(driver);
	}
	@Test(priority = 2)
	public void verifylogo() throws InterruptedException
	{
		Thread.sleep(1000);
		TCID=1;
		boolean actresult = home.getSwagLabHomePagelogo();
		Assert.assertTrue(actresult, "failed result not matched");
		
	}
	@Test(priority = 3)
	public void getremovetext() throws InterruptedException, EncryptedDocumentException, IOException
	{
		TCID=2;
		Thread.sleep(1000);
		home.clickSwagLabHomePagecart();
		Thread.sleep(1000);
		String acttext = home.getremoveSwagLabHomePageremovetext();
		String exptext = UtilityClass_1.testdata(0, 2);
		Assert.assertEquals(acttext, exptext,"failed both are diff");
		
	}
	@AfterMethod
	public void logoutfromapp(ITestResult f1) throws InterruptedException, IOException
	{
		Thread.sleep(1000);
		if(f1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass_1.cpaturess(driver, TCID);
		}
		home.clickSwagLabHomePagemenu();
		Thread.sleep(2000);
		menu.clickSwagLabMenuPagelogoutbtn();
	}
	@AfterClass
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
	

}
