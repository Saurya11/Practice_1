package HandlingOf_CustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_option_using_home_key_2
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(6000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Thread.sleep(3000);
		
		Actions act=new Actions(driver);
		
		Thread.sleep(5000);
		act.click(month).perform();
		Thread.sleep(3000);
		
		act.sendKeys(Keys.HOME).perform();
		Thread.sleep(3000);
		
		for(int i=1;i<=5;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
	}

}
