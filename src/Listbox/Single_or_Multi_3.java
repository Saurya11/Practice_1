package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_or_Multi_3
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		
		Select s=new Select(element);
		
		Thread.sleep(2000);
		
		boolean result = s.isMultiple();
		
		if(result==true)
		{
			System.out.println("Listbox is multiselectable");
		}
		else
		{
			System.out.println("listbox is single selectable");
		}
		
		
	}

}
