package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword4_Timeout_2
{
	@Test(timeOut = 2000)
	public void TC1() throws InterruptedException
	{
		Thread.sleep(3000);
		Reporter.log("--running test case1--",true);
	}
	@Test(invocationTimeOut = 2000)
	public void TC2() throws InterruptedException
	{
		Thread.sleep(1000);
		Reporter.log("--running test case2--",true);
	}

}
