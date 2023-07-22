package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_AssertClass3_assertTrue_1 
{
	@Test
	public void TC1()
	{
		boolean actresult=false;
		
		Assert.assertTrue(actresult,"failed-act result is pass");
		
	}

}
