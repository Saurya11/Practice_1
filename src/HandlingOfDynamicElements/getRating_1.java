package HandlingOfDynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class getRating_1 
{
	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on close button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//search mob
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("one plus nord ce 2");
		
		//click on search button
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		String rating = driver.findElement(By.xpath("(//div[@class='_2kHMtA'][1]//span)[6]")).getText();
		System.out.println(rating);
		
	}

}
