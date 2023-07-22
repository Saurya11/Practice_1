package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Selectable_3 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Thread.sleep(2000);
		
		Select s=new Select(month);
		
		Thread.sleep(2000);
		
		s.selectByVisibleText("Aug");
		
		Thread.sleep(2000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Thread.sleep(2000);
		
		Select s1=new Select(day);
		
		s1.selectByVisibleText("11");
		
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		
		Select s2=new Select(year);
		
		Thread.sleep(2000);
		
		s2.selectByVisibleText("1996");
		
		Thread.sleep(2000);
		
		driver.close();
		
		
	}
}
