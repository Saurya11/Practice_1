package Navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo2 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.navigate().to("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.google.co.in/");
		
		Thread.sleep(3000);
		
		driver.navigate().back();
			
		Thread.sleep(3000);
		
		driver.navigate().forward();
		
		Thread.sleep(3000);
		driver.navigate().refresh();
	
	}

}
