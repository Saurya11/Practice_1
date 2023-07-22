package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amul_2
{
	public static void main(String[]args) throws IOException, InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://shop.amul.in/WebForms/Web_Dist_Category_List.aspx?DistId=MTExMTExMQ==");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\\\Users\\\\Suraj Bankar\\\\OneDrive\\\\Desktop\\\\Sourabh 11\\\\Screenshot\\\\pic12.jpeg");

		FileHandler.copy(source,dest);
	}

}
