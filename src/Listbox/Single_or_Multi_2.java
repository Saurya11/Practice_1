package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_or_Multi_2
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		Thread.sleep(3000);
		
		WebElement element = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		
		Select s=new Select(element);
		
		boolean result = s.isMultiple();
		
		System.out.println(result);
		
		if(result==true)
		{
			System.out.println("is multi selectable");
		}
		else
		{
			System.out.println("is single selectable");
		}
		
		
	}

}
