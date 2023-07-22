package TestNg;

import org.testng.Assert;

public class example7_AssertClass2_assertNotEquals_2 
{
	public void TC1()
	{
		String actresult="hii";
		String expresult="hello";
		
		Assert.assertNotEquals(actresult, expresult);
	}

}
