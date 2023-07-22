package Xpath_by_Contain_Attribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Orange_1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[contains(@class,'oxd-input')]")).sendKeys("Admin");
		
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//input[contains(@class,'oxd-input ')])[2]")).sendKeys("admin123");
		
	}

}
