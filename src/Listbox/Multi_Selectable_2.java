package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_Selectable_2 
{
	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		//step-1
		WebElement element = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		
		//step-2
		Select s=new Select(element);
		
		//step-3
		s.selectByVisibleText("Switch Commands");
		s.selectByVisibleText("WebElement Commands");
	}

}
