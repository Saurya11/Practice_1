package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_2 
{
	@BeforeClass
	public void openbrowser()
	{
		Reporter.log("browser open",true);
	}
	@BeforeMethod
	public void logintoapp()
	{
		Reporter.log("login to app",true);
	}
	@Test                     //test case or test method
	public void verifylogo()
	{
		Reporter.log("verify logo",true);
	}
	@Test                     //test case or test method
	public void clickoncart()
	{
		Reporter.log("click on cart button",true);
	}
	@AfterMethod
	public void logoutfromapp()
	{
		Reporter.log("logout from the app",true);
	}
	@AfterClass
	public void closebrowser()
	{
		Reporter.log("close the browser",true);
	}
	
	

}
