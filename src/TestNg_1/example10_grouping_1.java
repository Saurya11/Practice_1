package TestNg_1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example10_grouping_1 
{
	@Test(groups = "login")
	public void TC1()
	{
		Reporter.log("--running TC1--",true);
	}
	@Test(groups = "login")
	public void TC2()
	{
		Reporter.log("--running TC2--",true);
	}
	@Test(groups = "orders")
	public void TC3()
	{
		Reporter.log("--running TC3--",true);
	}
	@Test(groups = "fund")
	public void TC4()
	{
		Reporter.log("--running TC4--",true);
	}

}
