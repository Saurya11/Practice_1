package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_3 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	    List<WebElement> all = driver.findElements(By.xpath("//a"));
	    
	    for(WebElement f1:all)
	    {
	    	System.out.println(f1.getText());
	    }
		
	}

}
