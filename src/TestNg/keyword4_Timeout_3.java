package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword4_Timeout_3 
{
	@Test(timeOut = 2000)
	public void TC1() throws InterruptedException
	{
		Thread.sleep(3000);
		Reporter.log("--running TC1--",true);
	}

}
