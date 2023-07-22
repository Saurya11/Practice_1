package Screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Vadilal 
{
	@Test
	public void Screen() throws IOException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.vadilalicecreams.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		Reporter.log("source",true);
		
		File dest=new File("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\Screenshot\\pic_16.jpeg");
		
		FileHandler.copy(source, dest);
		
		driver.quit();
	}

	
}
