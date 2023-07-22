 package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dropdown_1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		//click on close button
		 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 
		 //step-1
		WebElement log = driver.findElement(By.xpath("//a[text()='Login']"));
		
		//step-2
		Actions act=new Actions(driver);
		
		//step-3
		act.moveToElement(log).perform();
		
		Thread.sleep(3000);
		
		//click my account element from dropdown
		
		driver.findElement(By.xpath("//div[text()='My Profile']")).click();
		
		
		
		
	}

}
