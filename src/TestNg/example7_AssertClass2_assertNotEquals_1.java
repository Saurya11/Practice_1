package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_AssertClass2_assertNotEquals_1 
{
	@Test
	public void TC1()
	{
		String actresult="hiii";
		String expresult="hello";
		
		Assert.assertNotEquals(actresult, expresult,"both are same");
	}

}
