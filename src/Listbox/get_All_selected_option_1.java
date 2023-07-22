package Listbox;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class get_All_selected_option_1 
{
	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		
		WebElement element = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		
		Select s=new Select(element);
		
		s.selectByIndex(3);
		s.selectByIndex(1);
		s.selectByIndex(2);
		
		List<WebElement> allselected = s.getAllSelectedOptions();
		
		for(WebElement s1:allselected)
		{
			System.out.println(s1.getText());
		}
			
	}

}
