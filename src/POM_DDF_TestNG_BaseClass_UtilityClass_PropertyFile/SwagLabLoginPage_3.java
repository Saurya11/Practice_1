package POM_DDF_TestNG_BaseClass_UtilityClass_PropertyFile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage_3
{
	@FindBy(xpath="//input[@placeholder='Username']") private WebElement UN;
	@FindBy(xpath="//input[@placeholder='Password']") private WebElement PWD;
	@FindBy(xpath="//input[@id='login-button']") private WebElement login;
	
	public SwagLabLoginPage_3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public  void inpSwagLabLoginPageun(String username)
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

}
