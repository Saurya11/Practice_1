package JS_Slider;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scroll_up_down_1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		//down-->2nd parameter +ve value
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");
		
		
		Thread.sleep(3000);
		//slide up--> 2nd parameter -ve value
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-1000)");
		
		
		
		
		
	}

}
