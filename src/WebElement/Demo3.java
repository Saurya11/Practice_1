package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo3
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		WebElement f2 = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		
		f2.click();
		
		Thread.sleep(3000);
		boolean f1 = driver.findElement(By.xpath("(//input[@type='radio'])[1]")).isSelected();
		
		System.out.println(f1);
		
		if(f1==true)
		{
			System.out.println("selected");
		}
		else
		{
			System.out.println("not selected");
		}
		
	}

}
