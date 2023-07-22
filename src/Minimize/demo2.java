package Minimize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo2
{
	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().minimize();
		
	}

}
