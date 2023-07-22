package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_4 
{
	public static void main(String [] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		System.out.println(link.size());
		
		Thread.sleep(2000);

		for(WebElement all:link)
		{
			System.out.println(all.getText());
		}
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
	

}
