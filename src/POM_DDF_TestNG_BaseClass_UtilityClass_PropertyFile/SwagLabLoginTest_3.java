package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabLoginTest_3 extends BaseClass_3
{
	int TCID;
	SwagLabLoginPage_3 login;
	SwagLabHomePage_3 home;
	SwagLabMenuPage_3 menu;
	
	@BeforeClass
	public void openbrowser() throws IOException
	{
		initializebrowser();
		login=new SwagLabLoginPage_3(driver);
		home=new SwagLabHomePage_3(driver);
		menu=new SwagLabMenuPage_3(driver);
		
	}
	@BeforeMethod
	public void logintoapp() throws IOException, InterruptedException
	{
		login.inpSwagLabLoginPageun(UtilityClass_3.getPFdata("UN"));
		Thread.sleep(1000);
		login.inpSwagLabLoginPagepwd(UtilityClass_3.getPFdata("PWD"));
		Thread.sleep(2000);
		login.clickSwagLabLoginPagelogin();
	}
	@Test(priority = 1)
	public void verifylogo() throws InterruptedException
	{
		TCID=11;
		Thread.sleep(2000);
		boolean actresult = home.getSwagLabHomePagelogo();
		Assert.assertTrue(actresult, "failed result not matched");
		
	}
	@Test(priority = 2)
	public void getremovetext() throws InterruptedException, IOException
	{
		TCID=12;
		home.clickSwagLabHomePagecart();
		Thread.sleep(2000);
		
		String acttext = home.getSwagLabHomePageremovetext();
		String exptext = UtilityClass_3.testdata(0,2);
		Assert.assertEquals(acttext, exptext,"failed both are diffrent");
		
	}
	@AfterMethod
	public void logoutfromapp(ITestResult f1) throws InterruptedException, IOException
	{
		if(f1.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass_3.capturess(driver, TCID);
		}
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
