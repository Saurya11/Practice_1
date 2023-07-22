package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword3_Eanbled_3 
{
	@Test
	public void TC1()
	{
		Reporter.log("--running TC-1--",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("--running TC-2--",true);
	}
	@Test(enabled = false)
	public void TC3()
	{
		Reporter.log("--running TC-3--",true);
	}

}
