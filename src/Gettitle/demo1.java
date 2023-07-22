package Gettitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo1
{
	public static void main(String[]args)
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://web.whatsapp.com/");
		
		//String title=driver.getTitle();
		
		//System.out.println(title);
		
		System.out.println(driver.getTitle());
	}

}
