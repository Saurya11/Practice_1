package TestNg;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotations_1
{
	@BeforeClass
	public void openbrowser()
	{
		Reporter.log("--browser open--",true);
	}
	@BeforeMethod
	public void loginToapp()
	{
		Reporter.log("--login to app--",true);
	}
	@Test(priority = 1)
	public void verifylogo()          //test case or test method
	{
		Reporter.log("--running logo 1TC--",true);
	}
	@Test(priority = 2)
	public void verifylogo2()         //test case or test method
	{
		Reporter.log("--running test case TC2--",true);
	}
	 @AfterMethod
	 public void logoutfromapp()
	 {
		 Reporter.log("--logout from app--",true);
	 }
	 @AfterClass
	 public void closeapp()
	 {
		 Reporter.log("--browser close--",true);
	 }

	 
}
