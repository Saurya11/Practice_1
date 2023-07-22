package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class facebookTest_1 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		facebookloginpage_1 login=new facebookloginpage_1(driver);
		
		login.inpfacebookloginpage_1username();
		login.inpfacebookloginpage_1password();
		
		Thread.sleep(3000);
		
		login.clickfacebookloginpage_1loginbtn();
		
		Thread.sleep(5000);
		facebookhomepage_1 home=new facebookhomepage_1(driver);
		
		home.getfacebookhomepage_1text();
		
		Thread.sleep(10000);
		

		home.clickfacebookhomepage_1account();
		
		Thread.sleep(8000);
		
		facebookaccountpage_1 out=new facebookaccountpage_1(driver);
		
		out.clickfacebookaccountpage_1logoutbtn();
		
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}

}
