package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword3_Eanbled_4
{
	@Test
	public void TC1()
	{
		Reporter.log("--running test case1--",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("--running test case2--",true);
	}
	@Test(enabled = false)
	public void TC3()
	{
		Reporter.log("--running test case3--",true);
	}

}
