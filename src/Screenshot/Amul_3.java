package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amul_3
{
	public static void main(String [] args) throws IOException
	{
		WebDriver driver=new EdgeDriver();

		driver.get("https://amul.com/products/milk.php");

		driver.manage().window().maximize();

		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\Screenshot\\pic5.jpeg");

		FileHandler.copy(source,dest);
	}

}
