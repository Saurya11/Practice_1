package HandlingOfAutosugetions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo_2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("redmi");
		
		String Exptext = "redmi note 11 pro";
		
		List<WebElement> alloption = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		for(WebElement f1:alloption)
		{
			String acttext = f1.getText();
			if(acttext.equals(Exptext))
			{
				f1.click();
				break;
			}
		}
		
		
		
	}

}
