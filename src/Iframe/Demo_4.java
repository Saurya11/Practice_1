package Iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_4
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
		
		Thread.sleep(3000);
		
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		
		System.out.println("Total No Of Frames:"+frame.size());
				
		Thread.sleep(3000);
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		
		System.out.println("Total no Of Link:"+link.size());
		
		Thread.sleep(3000);
		
		for(WebElement all:link)
		{
			System.out.println(all.getText());
		}
		
		Thread.sleep(3000);
		
		driver.close();
		
	}
}
