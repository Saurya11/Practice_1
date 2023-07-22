package Hiiden_Division_popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_3 
{
	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		//click on login button
		
		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();
		
	}

}
