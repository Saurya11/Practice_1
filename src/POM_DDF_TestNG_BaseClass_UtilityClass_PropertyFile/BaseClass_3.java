package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass_3
{
	WebDriver driver;
	
	public void initializebrowser() throws IOException
	{
		driver=new EdgeDriver();
		
		driver.get(UtilityClass_3.getPFdata("URL"));
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

}
