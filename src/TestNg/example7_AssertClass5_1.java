package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_AssertClass5_1 
{
	@Test
	public void TC1()
	{
		boolean actresult1 = false;
		
		Assert.assertFalse(actresult1,"failed actresult is true");
		
		String actresult="hii";
		
		String expresult="hii";
		
		Assert.assertEquals(actresult, expresult,"failed both the result are diff");
	}

}
