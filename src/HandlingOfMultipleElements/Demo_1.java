package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_1 
{
	public static void main(String[] args)
	{
		//print all links on facebook
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
	List<WebElement> all = driver.findElements(By.xpath("//a"));
	
	for(WebElement f1:all)
	{
		System.out.println(f1.getText()); 
	}
		
		
	}

}
