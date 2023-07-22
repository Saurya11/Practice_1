package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SwagLabLoginTest
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		SwagLabLoginPage login=new SwagLabLoginPage(driver);
		
		login.enterUN();
		login.EnterPWD();
		
		Thread.sleep(3000);
		
		login.clickLogin();
		
		Thread.sleep(3000);
		
		SwagLabHomePage home=new SwagLabHomePage(driver);
		
		home.verifylogo();
		
		Thread.sleep(2000);
		
		home.clickonmenu();
		
		Thread.sleep(2000);
		
		SwagLabMenuPage main=new SwagLabMenuPage(driver);
		
		main.clicklogout();
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
