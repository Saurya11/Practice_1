package TestNg_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class parallel_2 
{
	@Test
	public void opengoogle() throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.close();
		
		
	}

}
