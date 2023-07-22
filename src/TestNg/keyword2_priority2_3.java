package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword2_priority2_3 
{
	@Test(priority = 2)            //duplicate priority
	public void TC1()
	{
		Reporter.log("--running test case1--",true);
	}
	@Test(priority = -2)         //-ve priority
	public void TC2()
	{
		Reporter.log("--running test case2--",true);
	}
	@Test                      //deault priority
	public void TC3()
	{
		Reporter.log("--running test case3--",true);
	}
	@Test (priority = 2)      //duplicate priority
	public void TC4()
	{        
		Reporter.log("--running test case4--",true);
	}
	@Test(priority = 1)
	public void TC5()
	{
		Reporter.log("--running test case5--",true);
	}

}
