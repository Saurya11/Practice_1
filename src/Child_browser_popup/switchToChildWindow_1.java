package Child_browser_popup;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class switchToChildWindow_1
{
	public static void main(String[] args) 
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//click on new tab from main menu
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		//get child window id
		Set<String> all = driver.getWindowHandles();   //[id of main page[],child browser id]
		
		ArrayList<String> al=new ArrayList<String>(all); //mainpageid[0],child browser id[1]
		
		String childwindowid = al.get(1);
		
		//switch to child window
		
		driver.switchTo().window(childwindowid);   //String childwindow id
		
		//click on child"training" link from child window
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		
		
		
	}

}
