package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		boolean f1 = driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']")).isDisplayed();
		
		System.out.println(f1);
		
		if(f1==true)
		{
			System.out.println("element is displayed");
		}
		else
		{
			System.out.println("element is not displayed");
		}
	}

}
