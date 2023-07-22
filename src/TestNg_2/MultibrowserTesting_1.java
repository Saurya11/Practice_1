package TestNg_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class MultibrowserTesting_1 
{
	@Parameters ("browsername")
	@Test
	public void TC(String browsername) throws InterruptedException
	{
		WebDriver driver=null;
		if(browsername.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		else if(browsername.equals("chrome"))
		{
			driver=new ChromeDriver();
		}
		
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.quit();
	}
	

}
