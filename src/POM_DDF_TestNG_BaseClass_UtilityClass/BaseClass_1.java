package POM_DDF_TestNG_BaseClass_UtilityClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass_1
{
	WebDriver driver;

	public void initializebrowser()
	{
		driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

}
