package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword2_priority2_2 
{
	@Test(priority = 1)
	public void TC1()      
	{
		Reporter.log("--Running Test case1--",true);
	}
	
	@Test(priority = 2)     //duplicate priority
	public void TC2()
	{
		Reporter.log("--Running Test case2--",true);
	}
	@Test
	public void TC3()       //default priority
	{
		Reporter.log("--Running Test case3--",true);
	}
	@Test(priority = -2)   //-ve priority
	public void TC4()
	{
		Reporter.log("--Running Test case4--",true);
	}
	@Test(priority = 2)          //duplicate priority
	public void TC5()
	{
		Reporter.log("--Running Test case5--",true);
	}
	

}
