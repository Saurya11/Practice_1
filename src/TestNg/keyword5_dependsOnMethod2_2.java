package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword5_dependsOnMethod2_2
{
	@Test
	public void login1()
	{
		Reporter.log("--running login1--",true);
	}
	@Test
	public void login2()
	{
		Reporter.log("--running login2--",true);
	}
	@Test(dependsOnMethods = {"login1","login2"})
	public void logout()
	{
		Reporter.log("--running logout--",true);
	}

}
