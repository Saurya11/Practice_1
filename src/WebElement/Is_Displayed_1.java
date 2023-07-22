package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Is_Displayed_1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		boolean result = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("Is displayed");
		}
		else
		{
			System.out.println("Is not displayed");
		}
		
		driver.close();
	}

}
