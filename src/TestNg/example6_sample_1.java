package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example6_sample_1
{
	@Test
	public void TC1()
	{
		Reporter.log("--running tc-1",true);
	}
	@Test
	public void TC2()
	{
		Reporter.log("--running tc-2--",true);
	}
	@Test
	public void TC3()
	{
		Reporter.log("--running tc-3--",true);
	}

}
