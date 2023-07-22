package HandlingOf_CustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_option_using_home_key_1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on create new account
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);
		
		//step-1
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//step-2
		Actions act=new Actions(driver);
		
		
		//step-3 click on month
		act.click(month).perform();
		Thread.sleep(3000);
		
		//navigate to home option
		act.sendKeys(Keys.HOME).perform();
		//navigate to august option
		Thread.sleep(3000);
		
		for(int i=1;i<=7;i++)
		{
			act.sendKeys(Keys.ARROW_DOWN).perform();
		}
		Thread.sleep(3000);
		//select option using enter key
		act.sendKeys(Keys.ENTER).perform();
		
	}

}
