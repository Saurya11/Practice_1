package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword2_priority3
{
	@Test(priority = 3)
	public void TC1()
	{
		Reporter.log("--running test case1--",true);
	}
	@Test(priority = 2)
	public void TC2()
	{
		Reporter.log("--running test case2--",true);
	}
	@Test(priority = 1)
	public void TC3()
	{
		Reporter.log("--ruuning test case3--",true);
	}

}
