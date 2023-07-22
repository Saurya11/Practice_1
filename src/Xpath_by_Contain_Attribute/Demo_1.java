package Xpath_by_Contain_Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_1 
{
	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]")).sendKeys("abc");
		
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext _55r1')])[2]")).sendKeys("def");
		
	}
 
}
