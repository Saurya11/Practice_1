package Alert_popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_1 
{
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		 
		//enter on customer id
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("11");
		Thread.sleep(3000);
		
		//click on submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//action1-get text on alert popup
		
		String text = driver.switchTo().alert().getText();
		
		System.out.println(text);
		
		//click on cancel button on alert popup
		Thread.sleep(3000);
		//driver.switchTo().alert().dismiss();
		//click on ok button on alert popup
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		String f1 = driver.switchTo().alert().getText();
		System.out.println(f1);
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
	}

}
