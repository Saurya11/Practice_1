package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Drag_Drop_Action_2
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("(//li[@class='block13 ui-draggable'])[1]"));
		
		WebElement dest = driver.findElement(By.xpath("(//div[@class='ui-widget-content'])[3]"));

		Actions act=new Actions(driver);
		
		act.dragAndDrop(src, dest).perform();
	}

}
