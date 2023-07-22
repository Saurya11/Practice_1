package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Is_enabled_1 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		boolean f1 = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		
		System.out.println(f1);
		
	if(f1==true)
	{
		System.out.println("Is enabled");
	}
	else
	{
		System.out.println("Is not enabled");
	}
	}

}
