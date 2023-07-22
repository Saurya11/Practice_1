package HandlingOfAutosugetions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_1
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Redmi Note 10");
		
		Thread.sleep(4000);
		
		String exptext = "Redmi Note 10";
		
		Thread.sleep(4000);
		
	    List<WebElement> alloption = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		for(WebElement f1:alloption)
		{
		String acttext = f1.getText();
		
		if(acttext.equals(exptext))
		{
			f1.click();
			break;
		}
		}
		
	}

}
