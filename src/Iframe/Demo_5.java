package Iframe;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_5 
{
  public static void main(String[] args) throws InterruptedException
  {
	 WebDriver driver=new EdgeDriver();
	 
	 driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
	 
	 driver.manage().window().maximize();
	 
	 Thread.sleep(2000);
	 
	 driver.switchTo().frame("iframeResult");
	 
	 Thread.sleep(2000);
	 
	 driver.findElement(By.xpath("//button[@type='button']")).click();
	 
	 Thread.sleep(2000);
	 
	 driver.switchTo().defaultContent();
	 
	 driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	 
	 Thread.sleep(3000);
	 
	List<WebElement> all = driver.findElements(By.tagName("a"));
	
	System.out.println("Total link present:"+all.size());
	
	Thread.sleep(5000);
	
    driver.close();
	
}
}
