package Child_browser_popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class switchToMainPageFromChildWindow_1
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on new tab of main page
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
 		
		//get child window id
		
		Set<String> all = driver.getWindowHandles();
		
		ArrayList<String>al=new ArrayList<String>(all);
		
		//switch to child window
		driver.switchTo().window(al.get(1));
		
		//click on training link from child window
		
		driver.findElement(By.xpath("//span[text()='Training']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(al.get(0));
		
		Thread.sleep(2000);
		//click on new window tab
		
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
		Thread.sleep(2000);
		
		driver.close(); 
		
		
	}

}
