package Xpath_by_Contain_text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_1 
{
	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		
		driver.findElement(By.xpath("(//a[contains(text(),'Create')])[1]")).click();
		
	}

}
