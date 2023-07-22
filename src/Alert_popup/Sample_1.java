package Alert_popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample_1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		//enter customer id
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("11");
		
		//click on submit
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Alert f1 = driver.switchTo().alert();
		//get text on alert popup
		
		String f2 = f1.getText();
		System.out.println(f2);
		//click on cancel button
		//f1.dismiss();
		
		f1.accept();
		
		Thread.sleep(3000);
		String f3 = f1.getText();
		System.out.println(f3);
		Thread.sleep(2000);
		f1.accept();
		
	}

}
