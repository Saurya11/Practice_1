package And_Or;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get(" https://www.google.co.in/ ");
		
		driver.findElement(By.xpath("//input[@class='gLFyf' and @name='q']")).sendKeys("facebook");
		
		
		
	}

}
