package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestNGTestClass_2
{
	@Test
	public void TC1() throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
