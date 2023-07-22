package Minimize;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.edge.EdgeDriver;

public class demo1

	
{
public static void main(String[] args) 
{
	

	WebDriver driver=new EdgeDriver();
	
	driver.get("https://web.whatsapp.com/");

	
//	driver.manage().window().minimize();
//	Options s1 = driver.manage();
//	Window s2 = s1.window();
//	s2.minimize();
	
	Options s1 = driver.manage();
	Window s2 = s1.window();
	s2.minimize();

	

}


}
