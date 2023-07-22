package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Getcurrenturl 
{
	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.google.co.in/");
		
		String text=driver.getCurrentUrl();
		
		System.out.println(text);
		
	}

}
