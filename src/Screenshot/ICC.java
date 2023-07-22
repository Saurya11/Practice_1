package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ICC
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://upload.wikimedia.org/wikipedia/commons/7/77/Icc_cricket_world_cup_2023_logo.jpg");
		
		driver.manage().window().maximize();
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\Screenshot\\Screen_1.jpeg");
		
		FileHandler.copy(source, dest);
		
		Thread.sleep(2000);
		
		driver.close();
		
		
				
		
	}

}
