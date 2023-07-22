package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Sendkeys 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//enter UN
		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Saurabh");
		
		WebElement UN = driver.findElement(By.xpath("//input[@name='email']"));
		
		UN.sendKeys("saurabh");
		
			
	}

}
