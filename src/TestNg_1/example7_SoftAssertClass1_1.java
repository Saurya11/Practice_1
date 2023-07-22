package TestNg_1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class example7_SoftAssertClass1_1
{
	@Test
	public void TC1()
	{
		SoftAssert soft=new SoftAssert();
		
		boolean actresult1 = true;
		
		soft.assertFalse(actresult1,"faild1-act result is true");
		
		
		String actresult = "hii";
		
		String expresult = "hello";
		
		soft.assertEquals(actresult, expresult,"failed2-both result are diff");
		
		soft.assertAll();
	}

}
