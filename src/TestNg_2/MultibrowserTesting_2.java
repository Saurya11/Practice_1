package TestNg_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultibrowserTesting_2 
{
	@Parameters("browser")
	@Test
	public void TC(String browser) throws InterruptedException
	{
		WebDriver driver=null;
		
		if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browser.equals("Firefox"))
		{
			driver=new FirefoxDriver();
		}
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
