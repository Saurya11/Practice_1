package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword3_Eanbled_1 
{
	@Test
	public void TC1()
	{
		Reporter.log("--running test case-1--",true);
	}
	@Test(enabled = false)
	public void TC2()
	{
		Reporter.log("--runing test case-2--",true);
	}
	@Test(enabled = false)
	public void TC3()
	{
		Reporter.log("--running test case-3--",true);
	}
	

}
