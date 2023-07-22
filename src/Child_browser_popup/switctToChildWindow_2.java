package Child_browser_popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class switctToChildWindow_2
{
	public static void main(String[] args)
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click on new tab on main page
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get child browser index
		Set<String> all = driver.getWindowHandles();
		
		ArrayList<String> al=new ArrayList<String>(all);
		
		String child = al.get(1);
		
		//switch on child window
		
		driver.switchTo().window(child);
		
		//click on training
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
	}

}
