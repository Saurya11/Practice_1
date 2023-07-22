package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample1
{
	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		
		//step-1
		WebElement f1 = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		
		//step-2
		
		Select s1=new Select(f1);
		
		//step-3
		
		s1.selectByVisibleText("Switch Commands");
		s1.selectByVisibleText("Browser Commands");
		s1.selectByIndex(3);
		
		
		
	}


}
