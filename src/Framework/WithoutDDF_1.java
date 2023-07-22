package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WithoutDDF_1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//enter username
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		
		//enter password
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		boolean result = driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
		
		if(result==true)
		{
			System.out.println("logo found -->test case pass");
		}
		
		else
		{
			System.out.println("logo not found-->test case fail");
		}
		
		Thread.sleep(3000);
		//click on main menu
		
		driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='logout_sidebar_link']")).click();
	}

}
