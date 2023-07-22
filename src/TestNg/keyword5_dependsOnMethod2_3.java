package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword5_dependsOnMethod2_3 
{
	@Test
	public void login1()
	{
		Reporter.log("--login to browser1--",true);
	}
	@Test
	public void login2()
	{
		Reporter.log("--login to browser2--",true);
	}
	@Test(dependsOnMethods = {"login1","login2"})
	public void logout()
	{
		Reporter.log("--logout from browser--",true);
	}

}
