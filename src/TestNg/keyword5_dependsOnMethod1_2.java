package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword5_dependsOnMethod1_2 
{
	@Test
	public void login()
	{
		Reporter.log("--running test case login--",true);
	}
	@Test(dependsOnMethods = "login")
	public void logout()
	{
		Reporter.log("--running test case logout--",true);
	}

}
