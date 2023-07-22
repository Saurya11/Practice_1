package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Is_Selected_1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
	     WebElement result = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	     Thread.sleep(2000);
	     result.click();
	     Thread.sleep(2000);
	     boolean f1 = result.isSelected();
	     Thread.sleep(2000);
	
		
		System.out.println(f1);
		Thread.sleep(2000);
		
		if(f1==true)
		{
			System.out.println("Is selected");
		}
		else
		{
			System.out.println("Is not Selected");
		}
		Thread.sleep(3000);
		
		driver.close();
	}

}
