package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Single_Selectable_1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		//step-1
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		//step-2
		Select s=new Select(month);
		
		//step-3
		//s.selectByVisibleText("Aug");
		//s.selectByValue("8");
		s.selectByIndex(7);
		
		
	}

}
