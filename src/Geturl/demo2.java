package Geturl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		//String current = driver.getCurrentUrl();
		//System.out.println(current);
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
