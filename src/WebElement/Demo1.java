package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://shop.apollotyres.com/register?returnUrl=%2Fpasswordrecovery");
		
		Thread.sleep(5000);
		
		WebElement f2 = driver.findElement(By.xpath("//input[@name='accept-consent']"));
		Thread.sleep(5000);
		
		f2.click();
		
		boolean f1 = driver.findElement(By.xpath("//input[@name='accept-consent']")).isSelected();
		
		System.out.println(f1);
		
		if(f1==true)
		{
			System.out.println("is selected");
			
		}
		
		else
		{
			System.out.println("not selected");
		}
		
		
		
	}

}
