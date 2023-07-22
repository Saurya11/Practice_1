package Screenshot;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen_1 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.dinshaws.co.in/product.html");
		
		driver.manage().window().maximize();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		System.out.println(source);
		
		File dest=new File("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\Screenshot\\shot_1.jpeg");
		
		FileHandler.copy(source, dest);
		
	//	WebElement f1 = driver.findElement(By.xpath("//img[@id='logo']"));
		
	//	File f2 = f1.getScreenshotAs(OutputType.FILE);
		
	//	File f3=new File("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\Screenshot\\screenshot_2.jpeg");
		
	//	FileHandler.copy(f2, f3);
			
		driver.close();
		
		
	}

}
