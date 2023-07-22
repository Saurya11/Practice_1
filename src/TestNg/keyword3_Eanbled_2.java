package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword3_Eanbled_2 
{
	@Test(priority = 2)
	public void TC1()
	{
		Reporter.log("--running test case-1--",true);
		
	}
	@Test(enabled = false)
	public void TC2()
	{
		Reporter.log("--running test case-2--",true);
	}
	@Test(priority = 1)
	public void TC3()
	{
		Reporter.log("Running test case-3--",true);
	}

}
