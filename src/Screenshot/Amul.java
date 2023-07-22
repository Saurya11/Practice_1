package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Amul 
{
	public static void main(String[] args) throws IOException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://shop.amul.in/WebForms/Web_Dist_Category_List.aspx?DistId=MTExMTExMQ==");
		
		driver.manage().window().maximize();
		
		//File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//File f2=new File("C:\\Users\\Suraj Bankar\\Desktop\\Sourabh 11\\Screenshot\\pic6.jpeg");
		
		//FileHandler.copy(f1, f2);
		
		WebElement d1 = driver.findElement(By.xpath("//p[@class='distributorname distname']"));
		
		File d2 = d1.getScreenshotAs(OutputType.FILE);
		
		File d3=new File("C:\\Users\\Suraj Bankar\\Desktop\\Sourabh 11\\Screenshot\\pic7.jpeg");
		
		FileHandler.copy(d2, d3);
		
		driver.close();
		
		
		
	}

}
