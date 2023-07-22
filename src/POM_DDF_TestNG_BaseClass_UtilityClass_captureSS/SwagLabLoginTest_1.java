package POM_DDF_TestNG_BaseClass_UtilityClass_captureSS;


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
	SwagLabMenuPage_1 main;
	@BeforeClass
	public void openbrowser()
	{
		initializebrowser();
		login=new SwagLabLoginPage_1(driver);
		home=new SwagLabHomePage_1(driver);
		main=new SwagLabMenuPage_1(driver);
	}
	@BeforeMethod
	public void logintoapp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.inpSwagLabLoginPageun(UtilityClass_1.gettd(0, 0));
		Thread.sleep(1000);
		login.inpSwagLabLoginPagepwd(UtilityClass_1.gettd(0, 1));
		Thread.sleep(3000);
		login.clickSwagLabLoginPagelogin();
		
		
	}
	
	@Test(priority = 2)
	public void verifylogo() throws InterruptedException
	{
		TCID=101;
		Thread.sleep(1000);
		boolean actresult = home.getSwagLabHomePagelogo();
		Assert.assertTrue(actresult, "failed-result not match");
		
	}
	@Test(priority = 3)
	public void getremovetext() throws InterruptedException, EncryptedDocumentException, IOException
	{
		TCID=102;
		home.clickSwagLabHomePagecartbtn();
		Thread.sleep(2000);
		String acttext = home.getSwagLabHomePageremovebtn();
		String exptext = UtilityClass_1.gettd(0, 2);
		Assert.assertEquals(acttext, exptext,"failed both are diff");
	}
	@AfterMethod
	public void logoutfromapp(ITestResult s1) throws InterruptedException, IOException
	{
		if(s1.getStatus()==ITestResult.FAILURE)
		{
				UtilityClass_1.capturess(driver, TCID);
		}
		Thread.sleep(2000);
		home.clickSwagLabHomePagemainbtn();
		Thread.sleep(2000);
		
		main.clickSwagLabMenuPagelogoutbtn();
	}
	@AfterClass
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.close();
		
	}
	

}
