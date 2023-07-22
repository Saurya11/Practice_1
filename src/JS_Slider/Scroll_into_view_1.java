package JS_Slider;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scroll_into_view_1
{
	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		//find careers webelement
		
		WebElement help = driver.findElement(By.xpath("//a[text()='Help']"));
		
		//This will scroll the page till the element is found
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", help);
		
	}

}
