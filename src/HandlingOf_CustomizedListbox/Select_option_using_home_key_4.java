package HandlingOf_CustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_option_using_home_key_4
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(4000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Actions act=new Actions(driver);
		
		act.click(month).perform();
		
		act.sendKeys(Keys.HOME).perform();
		
		for(int i=1;i<=7;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		act.sendKeys(Keys.ENTER).perform();
	}

}
