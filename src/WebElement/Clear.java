package WebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Clear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/");
		
		//Enter UN
		
		WebElement f1 = driver.findElement(By.xpath("//input[@name='email']"));
		
		f1.sendKeys("saurabh");
		
	    Thread.sleep(2000);
	    
	    f1.clear();
	    
	    Thread.sleep(3000);
	    
	    f1.sendKeys("ramu");
	
		
		
		
	}

}
