package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class keyword2_priority2_4
{
	@Test(priority = 1)         //duplicate priority
	public void TC1()
	{
		Reporter.log("Running TC1",true);
	}
	@Test(priority = -2)        //-ve priority
	public void TC2()
	{
		Reporter.log("Running TC2",true);
	}
	@Test(priority = 3)
	public void TC3()
	{
		Reporter.log("Running TC3",true);
	}
	@Test(priority = 1)      //duplicate priority
	public void TC4()
	{
		Reporter.log("Running TC4",true);
	}
	@Test                   //default priority
	public void TC5()
	{
		Reporter.log("Running TC5",true);
	}
	@Test(priority = 2)
	public void TC6()
	{
		Reporter.log("Running TC6",true);
	}





	

}
