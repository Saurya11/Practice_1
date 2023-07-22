package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class GetText
{
	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		String text = driver.findElement(By.xpath("//button[@name='login']")).getText();
		
		System.out.println(text);
	}

}
