package TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example7_AssertClass1_assertEquals_2
{
	@Test
	public void TC1()
	{
		String actresult="hiii";
		String expresult="hiii";
		
		Assert.assertEquals(actresult,expresult,"result not matched");
	}

}
