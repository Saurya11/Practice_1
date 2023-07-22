package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword1_Invocationcount_2
{
	@Test(invocationCount = 5,priority = 1)
	public void TC1()
	{
		Reporter.log("Running TC1",true);
	}
	@Test(invocationCount = 3,priority = 2)
	public void TC2()
	{
		Reporter.log("Runing TC2",true);
	}

}
