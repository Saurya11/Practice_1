package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword1_Invocationcount_1
{
	@Test(invocationCount = 2)
	public void testcase1()
	{
		Reporter.log("--running test case-1",true);
	}
	
}
