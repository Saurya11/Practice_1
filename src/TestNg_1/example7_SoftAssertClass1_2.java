package TestNg_1;

import org.testng.asserts.SoftAssert;

public class example7_SoftAssertClass1_2
{
	public void TC1()
	{
		SoftAssert soft=new SoftAssert();
		
		boolean actresult1 = true;
		
		soft.assertFalse(actresult1,"failed1-act result i true");
		
		String actresult = "hiii";
		String expresult = "hello";
		
		soft.assertEquals(actresult, expresult,"failed2-both result are diff");
		
		soft.assertAll();
	}

}
