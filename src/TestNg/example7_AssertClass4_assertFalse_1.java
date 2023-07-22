package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_AssertClass4_assertFalse_1
{
	@Test
	public void TC1()
	{
		boolean actresult = true;
		
		Assert.assertFalse(actresult,"Failed- act result is true");
	}

}
