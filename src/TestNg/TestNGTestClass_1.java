package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class TestNGTestClass_1 
{
	
	@Test
	public void TC1() throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.saucedemo.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
