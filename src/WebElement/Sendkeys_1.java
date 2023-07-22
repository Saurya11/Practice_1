package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Sendkeys_1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.flipkart.com/account/login?ret=%2Faccount%2F%3Frd%3D0%26link%3Dhome_account");
		
		WebElement f1 = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		
		f1.sendKeys("saurabh");
		Thread.sleep(3000);
		f1.clear();	
		//Thread.sleep(3000);	
		//f1.sendKeys("ganya");
		//driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		//Thread.sleep(3000);
		String f2 = driver.findElement(By.xpath("(//button[@type='submit'])[2]")).getText();
		
		System.out.println(f2);
		boolean f3 = driver.findElement(By.xpath("(//button[@type='submit'])[2]")).isEnabled();
		System.out.println(f3);
		
		if(f3==true)
		{
			System.out.println("is enabled");
		}
		else
		{
			System.out.println("is not enabled");
		}
		
		boolean f4 = driver.findElement(By.xpath("(//button[@type='submit'])[2]")).isDisplayed();
		System.out.println(f4);
		if(f4==true)
		{
			System.out.println("is displayed");
		}
		
		else
		{
			System.out.println("is not displayed");
		}
		
		
		
	}

}
