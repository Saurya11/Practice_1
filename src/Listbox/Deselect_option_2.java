package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Deselect_option_2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		
		Select s=new Select(element);
		
		s.selectByVisibleText("Browser Commands");
		s.selectByVisibleText("Switch Commands");
		s.selectByVisibleText("WebElement Commands");
		
		List<WebElement> s1 = s.getAllSelectedOptions();
		
		for(WebElement s2:s1)
		{
			System.out.println(s2.getText());
		}
		
//		List<WebElement> s1 = s.getOptions();
//		
//		for(WebElement s2:s1)
//		{
//			System.out.println(s2.getText());
//		}
//		
		Thread.sleep(3000);
		
		//s.deselectByVisibleText("Switch Commands");
		
		//s.deselectAll();
		
	}

}
