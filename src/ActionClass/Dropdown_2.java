package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown_2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		WebElement log = driver.findElement(By.xpath("//a[text()='Login']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(log).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//div[text()='My Profile']")).click();
		
	}

}
