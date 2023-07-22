package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick_1 
{
	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		//step-1
		
		WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));
		//step-2
		Actions act=new Actions(driver);
		
		//step-3
		//act.moveToElement(element).perform();
		//act.contextClick().perform();
		//act.moveToElement(element).contextClick().build().perform();
		act.contextClick(element).perform();
		
		
	}

}
