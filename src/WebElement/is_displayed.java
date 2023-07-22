package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class is_displayed
{
	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
		boolean f1 = driver.findElement(By.xpath("//a[text()='Create New Account']")).isDisplayed();
		
		System.out.println(f1);
		
		if(f1==true)
		{
			System.out.println("is displayed");
		}
		
		else
		{
			System.out.println("is not displayed");
		}
	}

}
