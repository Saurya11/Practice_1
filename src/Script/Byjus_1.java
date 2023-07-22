package Script;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import graphql.Assert;

public class Byjus_1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://byjus.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("rupali");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("7620559880");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		
		Thread.sleep(8000);
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rupalibankar782@gmail.com");
		
		Thread.sleep(4000);
		
		WebElement state = driver.findElement(By.xpath("//select[@name='state']"));
		
		Select f1=new Select(state);
		
		f1.selectByVisibleText("Maharashtra");
		
		Thread.sleep(3000);
		
		WebElement grade = driver.findElement(By.xpath("//select[@name='grade']"));
		
		Select f2=new Select(grade);
		
		f2.selectByVisibleText("Class 5");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Schedule a Free Class']")).click();
		
		Thread.sleep(2000);
		
		String name = driver.findElement(By.xpath("//span[@title='rupali']")).getText();
		
		if(name.equals("rupali"))
		{
			System.out.println("user name is valid");
		}
		String msg = driver.findElement(By.xpath("//p[text()='Booking Successful!']")).getText();
		
		if(msg.equals("Booking Successful!"))
		{
			System.out.println("Booking Successful!");
		}
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//img[@alt='user'])[1]")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='My profile']")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='email']")).clear();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rupalibankar782@gmail.com");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='date_of_birth']")).click();
		
		Thread.sleep(2000);
		
		WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		
		Select f3=new Select(month);
		
		f3.selectByVisibleText("February");
		
		Thread.sleep(3000);
		
	    WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
	    
	    Select f4=new Select(year);
	    
	    f4.selectByVisibleText("1999");
	    
	    Thread.sleep(3000);
	    
	   WebElement day = driver.findElement(By.xpath("//div[text()='11']"));
	   
	   Actions act=new Actions(driver);
	   
	   act.click(day).perform();
	   
	   Thread.sleep(5000);
	   
	  WebElement gender = driver.findElement(By.xpath("//div[text()='Female']"));
	  
	  Actions act2=new Actions(driver);
	  
	  act2.click(gender).perform();
	  
	  act2.sendKeys("Female").perform();
	  
	  act2.sendKeys(Keys.ENTER).perform();
	  
	  Thread.sleep(4000);
	  
	 WebElement city = driver.findElement(By.xpath("//input[@id='react-select-4-input']"));
	 
	 Actions act1=new Actions(driver);
	 
	 act1.click(city).perform();
	 
	 act1.sendKeys("Nagpur");
	 
	 act1.sendKeys(Keys.ENTER).perform();
	 
	 Thread.sleep(5000);
	 
	 driver.findElement(By.xpath("//button[text()='Save']")).click();
	 
	 Thread.sleep(5000);
	 
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 
	 js.executeScript("document.documentElement.scrollTop=0", "");
	 
	 Thread.sleep(4000);
	 
	 String text = driver.findElement(By.xpath("//p[text()='Nagpur, India']")).getText();
	 
	 System.out.println(text);
	 
	 if(text.equals("Nagpur, India"))
	 {
		 Assert.assertTrue(true);
	 }
	 else
	 {
		 Assert.assertTrue(false);
	 }
	 Thread.sleep(4000);
	 driver.quit();
	
	}


}
