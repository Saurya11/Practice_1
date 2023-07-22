package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_3 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s=new Select(day);
		
		s.selectByVisibleText("11");
		Thread.sleep(2000);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s1=new Select(month);
		
		s1.selectByVisibleText("Aug");
		Thread.sleep(2000);
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s2=new Select(year);
		
		s2.selectByVisibleText("1996");
		
		
		driver.close();
		
	}

}
