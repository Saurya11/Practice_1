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

public class SwagLabLoginTest_2 extends BaseClass_2
{
	int TCID;
	SwagLabLoginPage_2 login;
	SwagLabHomePage_2 home;
	SwagLabMenuPage_2 menu;
	@BeforeClass
	public void openbrowser() throws EncryptedDocumentException, IOException, InterruptedException
	{
		initializebrowser();
		login=new SwagLabLoginPage_2(driver);
		home=new SwagLabHomePage_2(driver);
		menu=new SwagLabMenuPage_2(driver);	
		Thread.sleep(2000);
		login.getScreenShot();

	}
	@BeforeMethod
	public void logintoapp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Thread.sleep(2000);
		login.inpSwagLabLoginPageun(UtilityClass_2.getPFtestdata("UN"));
		Thread.sleep(1000);
		login.inpSwagLabLoginPagepwd(UtilityClass_2.getPFtestdata("PWD"));

		Thread.sleep(1000);
		login.clickSwagLabLoginPagelogin();
	}

	@Test(priority = 1,invocationCount = 1)
	public void verifylogo() throws InterruptedException
	{
		Thread.sleep(2000);
		TCID=21;
		boolean actresult = home.getSwagLabHomePagelogo();
		Assert.assertTrue(actresult, "failed result not matched");
	}
	@Test(priority = 2)
	public void getremovetext() throws InterruptedException, EncryptedDocumentException, IOException
	{
		TCID=22;

		Thread.sleep(2000);
		home.clickSwagLabHomePagecartbtn();
		Thread.sleep(2000);
		String acttext = home.getSwagLabHomePageremovebtn();
		String exptext = UtilityClass_2.testdata(0, 2);
		Assert.assertEquals(acttext, exptext,"failed both are different");
		
	}
	@AfterMethod
	public void logoutfromapp(ITestResult f1) throws IOException, InterruptedException
	{
		if(f1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass_2.capturess(driver, TCID);
		}
		
		Thread.sleep(2000);
		home.clickSwagLabHomePagemenubtn();
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
