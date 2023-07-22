package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.support.ui.Select;

public class Demo_2
{
	
	public static void main(String[] args) throws InterruptedException
		
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s1=new Select(day);
		
		s1.selectByVisibleText("11");
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s2=new Select(month);
		
		s2.selectByVisibleText("Aug");
		
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s3=new Select(year);
		
		s3.selectByVisibleText("1996");
		
		Thread.sleep(4000);
		
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
