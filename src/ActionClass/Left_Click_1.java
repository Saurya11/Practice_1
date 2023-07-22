package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Left_Click_1
{
	public static void main(String[] args)
	{
		
	WebDriver driver=new EdgeDriver();
	
	driver.get("http://demo.guru99.com/test/simple_context_menu.html");
	
	//step-1
	WebElement element = driver.findElement(By.xpath("//a[@class='dropdown-toggle']"));
	
	//step-2
	Actions act=new Actions(driver);
	
	//step-3
	//act.click().perform();
	//act.moveToElement(element).click().perform();
	//act.moveToElement(element).perform();
	//act.moveToElement(element).click().build().perform();
	act.click(element).perform();
	
	}

}
