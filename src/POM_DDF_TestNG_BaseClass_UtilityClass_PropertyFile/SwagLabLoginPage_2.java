package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage_2
{
	@FindBy(xpath="//input[@placeholder='Username']") private WebElement UN;
	@FindBy(xpath="//input[@placeholder='Password']") private WebElement PWD;
	@FindBy(xpath="//input[@id='login-button']")   private WebElement login;
	@FindBy(xpath="//div[@class='bot_column']") private WebElement ss;
	
	public SwagLabLoginPage_2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void inpSwagLabLoginPageun(String username)
	{
		UN.sendKeys(username);
	}
	public void inpSwagLabLoginPagepwd(String password)
	{
		PWD.sendKeys(password);
	}
	public void clickSwagLabLoginPagelogin()
	{
		login.click();
	}
	public void getScreenShot() throws IOException
	{
		File f1 = ss.getScreenshotAs(OutputType.FILE);
		
		File f2=new File("C:\\Users\\Suraj Bankar\\OneDrive\\Desktop\\Sourabh 11\\Screenshot\\photo_4.jpeg");
		
		FileHandler.copy(f1, f2);
				
	}

}
