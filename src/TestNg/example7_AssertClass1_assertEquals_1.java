package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_AssertClass1_assertEquals_1
{
	@Test
	public void TC1()
	{
		String actresult="hiii";
		
		String expresult="hello";
		
		Assert.assertEquals(actresult, expresult,"failed both results are diff");
	}

}
