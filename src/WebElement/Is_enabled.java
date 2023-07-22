package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Is_enabled
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		boolean f1 = driver.findElement(By.xpath("(//a[@role='button'])[2]")).isEnabled();
		
		System.out.println(f1);
		
		if(f1==true)
		{
			System.out.println("element is enabled");
			
		}
		else
		{
			System.out.println("element is disabled");
		}
		
	}

}
