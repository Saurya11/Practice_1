package HandlingOf_CustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_option_1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
		//click on create new account
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		
		Thread.sleep(4000);
		
		//step-1
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//step-2
		Actions act=new Actions(driver);
		
		//step-3
		act.click(month).perform();
		
		Thread.sleep(2000);
		//step-4-select option
		//select option top using arrow up key
		
		act.sendKeys(Keys.ARROW_UP).perform();
		act.sendKeys(Keys.ARROW_UP).perform();
		
		//4b-select 1 option to bottom using arrow down key
		
		Thread.sleep(3000);
		
		act.sendKeys(Keys.ARROW_DOWN).perform();
		
		Thread.sleep(3000);
		
		//4c-select option using enter key
		act.sendKeys(Keys.ENTER).perform();
		
		
	}
	
	

}
