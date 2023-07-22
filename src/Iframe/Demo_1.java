package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_1
{
	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame
		//driver.switchTo ().frame("'iframeResult");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframeResult']")));   //frame web element
		
		driver.findElement(By.xpath("//button[contains(text(),'Click me')]")).click();
		
		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		
			
		
	}

}
