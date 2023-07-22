package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo_1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		//for day step=1
		
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		//step=2
		Select s=new Select(day);
		
		//step=3
		s.selectByVisibleText("11");
		
		Thread.sleep(3000);
		
		//for month step=1
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		//step=2
		Select f1=new Select(month);
		
		//step=3
		//f1.selectByVisibleText("Aug");
		//f1.selectByValue("8");
		f1.selectByIndex(7);
		Thread.sleep(3000);
		
		//step=1
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		//step=2
		Select f2=new Select(year); 
		
		//step=3
		
		f2.selectByVisibleText("1996");
		
		
		
		
		
		
		
		
		
		
	}

}
